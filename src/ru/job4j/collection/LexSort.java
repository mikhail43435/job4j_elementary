package ru.job4j.collection;

import java.util.Comparator;

public class LexSort implements Comparator<String> {

    @Override
    public int compare(String left, String right) {
        if ((left.length() == 0) && (right.length() == 0)) {
            return 0;
        }
        if (left.length() == 0) {
            return -1;
        }
        if (right.length() == 0) {
            return +1;
        }
        String[] splitLeft = left.split("\\.");
        String[] splitRight = right.split("\\.");
/*        int cycleLength = Math.min(splitLeft.length, splitRight.length);
        for (int index = 0; index < cycleLength; index++) {
*/      int index = 0;
            if (isDigit(splitLeft[index]) && isDigit(splitRight[index])) {
                if (Integer.parseInt(splitLeft[index]) > Integer.parseInt(splitRight[index])) {
                    return +1;
                }
                if (Integer.parseInt(splitLeft[index]) < Integer.parseInt(splitRight[index])) {
                    return -1;
                }
                if (Integer.parseInt(splitLeft[index]) == Integer.parseInt(splitRight[index])) {
                    return 0;
                }
            }
        //}
        return 0;
    }

    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}