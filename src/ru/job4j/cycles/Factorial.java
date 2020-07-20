package ru.job4j.cycles;

public class Factorial {
    public static int calc(int n) {
        int result = 1;
        /*if (n == 1) {
            return result;
        }*/
        for (int index = 2; index <= n; index++) {
            result = result * index;
            }
        return result;
    }
}