package ru.job4j.collection.bank;

import java.util.*;

/**
 * Класс реализует функционал перевода денежных средств
 * @author MK
 * @version 1.0
 */

public class BankService {
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод добавляет пользователя в список пользователей
     * @param user пользователь для добавления в список
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<>());
    }

    /**
     * Метод добавляет счет
     * @param passport строковое предстваление паспорта
     * @param account данные счета тип Account
     */
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

    /**
     * Метод ищет и возвращает пользвоателя по данным паспорта
     * @param passport строковое предстваление паспорта
     * @return результат поиска пользователя
     */
    public Optional<User> findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(e -> e.getPassport().equals(passport))
                .findFirst();
    }

    /**
     * Метод ищет пользователя по реквизитам
     * @param passport строковое предстваление паспорта
     * @param requisite строковое представление реквизитов
     * @return
     */
    public Optional<Account> findByRequisite(String passport, String requisite) {
        Optional<User> user = findByPassport(passport);
        if (user.isEmpty()) {
            return Optional.empty();
        }
        List<Account> accounts = users.get(user.get());
        return accounts.stream()
                .filter(e -> e.getRequisite().equals(requisite))
                .findFirst();
    }

    /**
     * Метод осуществляет процедуру перевода денежных средств между счетами
     * @param srcPassport строковое представление паспорта отправителя перевода
     * @param srcRequisite строковое предстваление реквизитов отправителя перевода
     * @param destPassport строковое представление данных паспорта получателя перевода
     * @param destRequisite строковое представление реквизитов получателя перевода
     * @param amount сумма перевода
     * @return булево значение: истина - перевод состоялся, лож - перевод не состоялся
     */
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