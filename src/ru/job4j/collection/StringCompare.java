package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        for (int i = 1; i < left.length() ; i++) {
            int leftChar = left.charAt(i);
            int rightChar = right.charAt(i);
            if (leftChar < rightChar) {
                return -1;
            } else if (leftChar > rightChar) {
                return +1;
            }
        }
        return 0;
    }
}