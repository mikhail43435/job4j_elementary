package ru.job4j;

public class SqArea {


    public static double square(int p, int k) {

        int h = p / (2 * (k + 1));
        int L = h * k;
        int s = L * h;

        double rsl = s;
        return rsl;
    }

    public static void main(String[] args) {
        double result1 = SqArea.square(4, 1);
        System.out.println("p = 4, k = 1, s = 1, result = " + result1);
    }
}
