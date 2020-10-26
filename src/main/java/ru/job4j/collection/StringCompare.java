package test.java.main.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int cycleLength = left.length() >= right.length() ? right.length() : left.length();
        for (int i = 0; i < cycleLength; i++) {
            int leftChar = left.charAt(i);
            int rightChar = right.charAt(i);
            if (leftChar < rightChar) {
                return -1;
            } else if (leftChar > rightChar) {
                return +1;
            }
        }
        if (cycleLength < right.length()) {
            return -1;
        }
        return 0;
    }
}