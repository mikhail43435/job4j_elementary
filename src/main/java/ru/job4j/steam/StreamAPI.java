package test.java.main.steam;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamAPI {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();
        list = List.of(1, 2, 3, -4, 5, 23, -45, 345, 3223);
        List<Integer> filteredList = list.stream().filter(value -> value > 0).collect(Collectors.toList());
        for (Integer value : filteredList) {
            System.out.println(value);
        }
    }
}
