package ru.job4j;

public class CalculatorWeight {
    public static double manWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static double womanWeight(short height) {
        double rsl = (height - 110) * 1.15;
        return rsl;
    }

    public static void main(String[] args) {
        short height = 187;
        double man = CalculatorWeight.manWeight(height);
        double woman = CalculatorWeight.womanWeight(height);

        System.out.println("Man 187 cm height ideal weight is " + man );
        System.out.println("Woman 187 cm height ideal weight is " + woman);

    }


}
