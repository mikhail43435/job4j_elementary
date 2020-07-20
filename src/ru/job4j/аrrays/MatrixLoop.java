package ru.job4j.аrrays;

public class MatrixLoop {
    public static void main(String[] args) {
        int[][] array = {
                {4, 2, 3, 454},
                {7, 1, 5, 56},
                {3, 5, 6, 67}
        };
        for (int row = 0; row < array.length; row++) {
            for (int cell = 0; cell < array[row].length; cell++) {
                int val = array[row][cell];
                System.out.println(row + "-" + cell + " : " + val);
            }
        }
    }
}