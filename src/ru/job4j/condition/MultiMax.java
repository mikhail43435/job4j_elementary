package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        return first > second ? first > third ? first : third : second > third ? second : third;
        }

    public static void main (String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max(3, 2, 1));
        System.out.println(max(2, 3, 1));
    }

}