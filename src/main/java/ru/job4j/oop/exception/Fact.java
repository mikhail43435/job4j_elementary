package ru.job4j.oop.exception;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        System.out.println(fact.calc(5));
        System.out.println(fact.calc(1));
    }

    public int calc(int number) {
        if (number < 0) {
            throw new IllegalArgumentException("N could not be less then 0");
        }
        int rsl = 1;
        for (int index = 1; index <= number; index++) {
            rsl *= index;
        }
        return rsl;
    }
}