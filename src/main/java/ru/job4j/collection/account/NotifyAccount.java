package test.java.main.collection.account;

import java.util.HashSet;
import java.util.List;

public class NotifyAccount {
    public static HashSet<Account> sent(List<Account> accounts) {
        HashSet<Account> result = new HashSet<>();
        for (Account value : accounts) {
            result.add(value);
        }
        return result;
    }
}