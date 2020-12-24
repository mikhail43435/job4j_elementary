package ru.job4j.collection.bank;

import java.util.Objects;

/**
 * Класс описывает модель данных пользователя
 * системы банковских переводов
 * @author MK
 * @version 1.0
 */

public class User {
    private String passport;
    private String username;

    /**
     * Конструктор класса
     * @param passport строковое предстваление данных паспорта пользователя
     * @param username строковое представление имени пользователя
     */
    public User(String passport, String username) {
        this.passport = passport;
        this.username = username;
    }

    /**
     * Метод позволяет получить данные паспорта пользователя
     * @return строку с данными паспорта
     */
    public String getPassport() {
        return passport;
    }

    /**
     * Метод позволяет установить паспорт пользователя
     * @param passport строковое представление паспорта
     */
    public void setPassport(String passport) {
        this.passport = passport;
    }

    /**
     * Метод позволяет получить имя пользователя
     * @return строку с именем пользователя
     */
    public String getUsername() {
        return username;
    }

    /**
     * Метод позволяет установить имя пользователя
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return Objects.equals(passport, user.passport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passport);
    }
}