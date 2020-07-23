package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        int result = first;
        if (second >= first && second >= third) {
            result = second;
        }
        if (third >= first && third >= second) {
            result = third;
        }
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {
        int result = first;
        if (second >= first && second >= third && second >= fourth) {
            result = second;
        } else if (third >= first && third >= second && third >= fourth) {
            result = third;
        } else if (fourth >= first) {
            result = fourth;
        }
        return result;
    }

    public static void main(String[] args){
        System.out.println(max(21, 11));
    }
}