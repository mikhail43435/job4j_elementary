package ru.job4j.Arrays;

public class Turn {
    public static int[] back(int[] array) {
        int temp;
        int arrayLength = array.length;
        //int cycleLimit = (arrayLength % 2) == 0 ? (arrayLength / 2) - 1 : arrayLength / 2;
        //for (int index = 0; index <= cycleLimit; index++) {
        for (int index = 0; index < array.length / 2; index++) {
            temp = array[index];
            array[index] = array[arrayLength - 1 - index];
            array[arrayLength - 1 - index] = temp;
        }
        return array;
    }
}