package ru.job4j.аrrays;

public class EndsWith {
    public static boolean endsWith(char[] word, char[] post) {
        boolean result = true;
        int startPositionInWord = word.length - post.length ;
        for (int i = 0;  i < post.length; i++) {
            if (word[startPositionInWord + i] != post[i]) {
                result = false;
                break;
            }
        }
        return result;
    }
}