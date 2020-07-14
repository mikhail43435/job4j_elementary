package ru.job4j;

public class CalculatorWeight {
    public static double manWeight(short height) {
        return (height - 100) * 1.15;
    }

    public static double womanWeight(short height) {
        return (height - 110) * 1.15;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = CalculatorWeight.manWeight(height);
        double woman = CalculatorWeight.womanWeight(height);

        System.out.println("Man 187 cm height ideal weight is " + man);
        System.out.println("Woman 187 cm height ideal weight is " + woman);
    }
}
