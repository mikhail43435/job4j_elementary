package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int tempNumber;
        tempNumber = first > second ? first : second;
        return tempNumber > third ? tempNumber : third;

    }

    public static void main(String[] args) {
        System.out.println(max(1, 2, 3));
        System.out.println(max(3, 2, 1));
        System.out.println(max(2, 3, 1));
    }

}