package test.java.main.аrrays;

import test.java.main.oop.encapsulation.Book;

public class SwitchArray {

    public static int[] swap(int[] array, int source, int dest) {
        int temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    public static int[] swapBorder(int[] array) {
        int temp = array[0];
        array[0] = array[array.length - 1];
        array[array.length - 1] = temp;
        return array;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5, 6};
        int[] rsl = swapBorder(nums);
        for (int index = 0; index < rsl.length; index++) {
            System.out.println(rsl[index]);
        }
    }

    public static String[] swapStringArray(String[] array, int source, int dest) {
        String temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }

    public static Book[] swap(Book[] array, int source, int dest) {
        Book temp = array[dest];
        array[dest] = array[source];
        array[source] = temp;
        return array;
    }
}