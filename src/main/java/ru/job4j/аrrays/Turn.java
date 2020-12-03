package ru.job4j.аrrays;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int arrayLength = array.length;
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[arrayLength - 1 - index];
            array[arrayLength - 1 - index] = temp;
        }
        return array;
    }
}