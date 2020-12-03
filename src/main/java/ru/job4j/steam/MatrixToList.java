package ru.job4j.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {
    public static void main(String[] args) {
        Integer[][] matrix = {{432, 332, 111}, {24, 343}, {32, 554}};
        matrixToList(matrix).forEach(System.out::println);
    }

    public static List<Integer> matrixToList(Integer[][] matrix) {
        return Arrays.stream(matrix)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());
    }
}
