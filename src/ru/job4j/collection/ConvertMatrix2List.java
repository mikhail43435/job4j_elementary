package ru.job4j.collection;

import java.util.ArrayList;
import java.util.List;

public class ConvertMatrix2List {
    public List<Integer> toList(int[][] array) {
        List<Integer> list = new ArrayList<>();
        for (int[] row : array) {
            int index = -1;
            for (int cell : row) {
                list.add(row[++index]);
            }
        }
        return list;
    }
}