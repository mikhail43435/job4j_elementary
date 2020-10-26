package test.java.main.collection;

import java.util.Arrays;
import java.util.HashSet;

public class UniqueText {
    public static boolean isEquals(String originText, String duplicateText) {
        boolean result = true;
        String[] origin = originText.split(" ");
        String[] text = duplicateText.split(" ");
        HashSet<String> check = new HashSet<>();
        /*for (String value : origin) {
            check.add(value);
        }*/
        check.addAll(Arrays.asList(origin));
        for (String value : text) {
            if (!check.contains(value)) {
                result = false;
                break;
            }
        }
        return result;
    }
}