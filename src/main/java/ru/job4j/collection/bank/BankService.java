package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    public void addAccount(String passport, Account account) {
        Optional<User> user = findByPassport(passport);
        if (user.isPresent()) {
            List<Account> accounts = users.get(user.get());
            if (!accounts.contains(account)) {
                accounts.add(account);
            }
        } else {
            System.out.println("User with passport " +  passport + " not found. Can't create account");
        }

    }

    public Optional<User> findByPassport(String passport) {
        /*
        for (Map.Entry<User, List<Account>> entry: users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getKey();
            }
        }*/
        Optional<User> user = users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst();
        return user;
    }

    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isEmpty()) {
            return Optional.empty();
        }
        List<Account> accounts = users.get(user.get());
        /*for (Account value : accounts) {
            if (value.getRequisite().equals(requisite)) {
                return value;
            }
        }*/
        Optional<Account> account = accounts.stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst();
        return account;
    }

    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        Optional<Account> srcAccount = findByRequisite(srcPassport, srcRequisite);
        Optional<Account>  destAccount = findByRequisite(destPassport, destRequisite);
        if (destAccount.isEmpty() || srcAccount.isEmpty() || srcAccount.get().getBalance() < amount) {
            return false;
        }
        destAccount.get().setBalance(destAccount.get().getBalance() + amount);
        return true;
    }
}