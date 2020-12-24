package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс представляет модель данных
 * банковского счета
 * @author MK
 * @version 1.0
 */

public class Account {
    private String requisite;
    private double balance;

    /**
     * Конструктор класса
     * @param requisite строковое представление реквизитов
     * @param balance сумма баланса счета
     */
    public Account(String requisite, double balance) {
        this.requisite = requisite;
        this.balance = balance;
    }

    /**
     * Метод возвращает реквизиты счета в виде строки
     * @return стоковое представление реквизитов счета
     */
    public String getRequisite() {
        return requisite;
    }

    /**
     * @deprecated
     */
    public void setRequisite(String requisite) {
        this.requisite = requisite;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Account account = (Account) o;
        return Objects.equals(requisite, account.requisite);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requisite);
    }
}