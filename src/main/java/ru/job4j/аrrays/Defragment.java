package ru.job4j.аrrays;

public class Defragment {
    public static String[] compress(String[] array) {
        for (int index = 0; index < array.length - 1; index++) {
            if (array[index] == null) {
                //**int point = index; /* указатель на null ячейку. */
                /* переместить первую не null ячейку. Нужен цикл. */
                for (int i = index + 1; i < array.length; i++) {
                    if (array[i] != null) {
                        array = SwitchArray.swapStringArray(array, i, index);
                        break;
                    }
                }
            }
         }
        return array;
    }

    public static void main(String[] args) {
        String[] input = {"I", null, "wanna", null, "be", null, "compressed"};
        System.out.print("Source string: ");
        for (int index = 0; index < input.length; index++) {
            System.out.print(input[index] + " ");
        }
        String[] compressed = compress(input);
        System.out.println();
        System.out.print("Result string: ");
        for (int index = 0; index < compressed.length; index++) {
            System.out.print(compressed[index] + " ");
        }
    }
}