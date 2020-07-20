package ru.job4j.Arrays;

public class ArrayChar {

    public static boolean startsWith(char[] word, char[] pref) {
        boolean result = true;
        if (word.length < pref.length) {
            System.out.println("Переданы некорректные значения!");
            return false;
        }
        for (int i = 0; i < pref.length; i++) {
            if (word[i] != pref[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}