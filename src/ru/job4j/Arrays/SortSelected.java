package ru.job4j.Arrays;

public class SortSelected {
    public static int[] sort(int[] data) {  // сортировка массива по возрастанию
        int min, index;
        for (int i = 0; i < data.length - 1; i++) {
        min = MinDiapason.findMin(data, i, data.length - 1);     // нашли мин в массиве
        index = FindLoop.indexOf(data, min, i, data.length - 1); // ищем индекс найденного мин элемента
        data = SwitchArray.swap(data, index, i);
        }
        return data;
    }
}