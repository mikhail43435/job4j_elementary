package test.java.main.lambda.reduce;

import java.util.function.BiFunction;
import java.util.function.Supplier;

public class Reduce {

    public static int summation(int to) {
        int rsl = 0;
        for (int index = 0; index <= to; index++) {
            rsl += index;
        }
        return rsl;
    }

    public static int multiplication(int to) {
        int rsl = 1;
        for (int index = 1; index <= to; index++) {
            rsl *= index;
        }
        return rsl;
    }

    public static void main(String[] args) {
        System.out.println(summation(3));
        System.out.println(multiplication(3));
    }

    private static int loop(int to, BiFunction<Integer, Integer, Integer> func, Supplier<Integer> initValue) {
        int rsl = initValue.get();
        for (int index = 1; index <= to; index++) {
            rsl = func.apply(rsl, index);
        }
        return rsl;
    }
}