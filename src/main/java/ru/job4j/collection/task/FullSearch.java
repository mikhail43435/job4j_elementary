package test.java.main.collection.task;

import java.util.HashSet;
import java.util.List;

public class FullSearch {
    public static HashSet<String> extractNumber(List<Task> list) {
        HashSet<String> numbers = new HashSet<>();
        for (Task value : list) {
            numbers.add(value.getNumber());
        }
        return numbers;
    }
}