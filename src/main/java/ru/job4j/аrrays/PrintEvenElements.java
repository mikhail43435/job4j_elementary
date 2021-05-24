package ru.job4j.аrrays;

public class PrintEvenElements {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15};
        System.out.println("В консоль выводятся элементы массива только с четными индексам");
        for (int i = 0; i < numbers.length; i++) {
            int currentIndex = numbers.length - 1 - i;
            if (currentIndex % 2 == 0) {
            System.out.println(
                    "Текущий элемент массива начиная с последнего: "
                            + currentIndex);
            }
        }
    }
}
