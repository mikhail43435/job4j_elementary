package ru.job4j.аrrays;

public class Matrix {
    public static int[][] multiple(int size) {
        int[][] table = new int[size][size];

        for (int row = 0; row < table.length; row++) {
            for (int cell = 0; cell < table[1].length; cell++) {
                table[row][cell] = (row + 1) * (cell + 1);
            }
        }
        return table;
    }
}
