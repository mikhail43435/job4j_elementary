package ru.job4j.oop.exception;

public class Fact {
    public static void main(String[] args) {
        Fact fact = new Fact();
        fact.calc(8);
        fact.calc(-1);
    }

    public int calc(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number should be more than or equal zero");
        }
        int rsl = 1;
        for (int index = 1; index <= n; index++) {
            rsl *= index;
        }
        return rsl;
    }
}