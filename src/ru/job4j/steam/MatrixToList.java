package ru.job4j.steam;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MatrixToList {

    public static void main(String[] args) {
        Integer[][] matrix = {{432, 332}, {24, 343}, {32, 554}};
        List<Integer> intList = Arrays.stream(matrix)
                .flatMap(x -> Arrays.stream(x))
                .collect(Collectors.toList());
        intList.stream().forEach(System.out::println);
    }
}
