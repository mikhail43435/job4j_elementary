package ru.job4j.аrrays;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i * 2 + 3;
        }
        // выводим массив
        /*for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }*/
        for (int value : numbers) {
            System.out.println(value);
        }
    }
}
