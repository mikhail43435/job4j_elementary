package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        if (user != null) {
            List<Account> accounts = users.get(user);
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        } else {
            System.out.println("User with passport " +  passport + " not found. Can't create account");
        }

    }

    public User findByPassport(String passport) {
        /*
        for (Map.Entry<User, List<Account>> entry: users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getKey();
            }
        }*/
        Optional<Map.Entry<User, List<Account>>> user = users.entrySet()
                .stream()
                .filter(e -> e.getKey().getPassport().equals(passport))
                .findFirst();
        return user.map(Map.Entry::getKey).orElse(null);
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) return null;
        List<Account> accounts = users.get(user);
        /*for (Account value : accounts) {
            if (value.getRequisite().equals(requisite)) {
                return value;
            }
        }*/
        Optional<Account> account = accounts.stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst();
        return account.orElse(null);
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount == null || srcAccount == null || srcAccount.getBalance() < amount) {
            return false;
        }
        destAccount.setBalance(destAccount.getBalance() + amount);
        return true;
    }
}