package ru.job4j.аrrays;

public class SortSelected {
    /**  сортировка массива по возрастанию */
    public static int[] sort(int[] data) {
        int min, index;
        for (int i = 0; i < data.length - 1; i++) {
        min = MinDiapason.findMin(data, i, data.length - 1);
        index = FindLoop.indexOf(data, min, i, data.length - 1);
        data = SwitchArray.swap(data, index, i);
        }
        return data;
    }
}