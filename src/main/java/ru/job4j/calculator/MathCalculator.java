package ru.job4j.calculator;

import static ru.job4j.math.MathFunction.*;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double sumOfOperationsSubAndDiv(double first, double second) {
        return subtraction(first, second) + division(first, second);
    }

    public static double sumOfOperationsSumMultDivSub(double first, double second) {
        return sum(first, second)
                + multiply(first, second)
                + division(first, second)
                + subtraction(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета 1 равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета 2 равен: " + sumOfOperationsSubAndDiv(10, 20));
        System.out.println("Результат расчета 3 равен: " + sumOfOperationsSumMultDivSub(10, 20));

    }
}
