package ru.job4j.collection.bank;

import java.util.*;

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
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
        for (Map.Entry<User, List<Account>> entry: users.entrySet()) {
            if (entry.getKey().getPassport().equals(passport)) {
                return entry.getKey();
            }
        }
        return null;
    }

    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user == null) {
            return null;
        }
        List<Account> accounts = users.get(user);
        for (ListIterator<Account> iterator = accounts.listIterator(); iterator.hasNext();) {
            Account value = iterator.next();
            if (value.getRequisite().equals(requisite)) {
                return value;
            }
        }
        /*int index = accounts.indexOf(new Account(requisite, -1));
        if (index != -1) {
            return (Account) accounts.get(index);
        } else {
            return null;
        }*/
        return null;
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