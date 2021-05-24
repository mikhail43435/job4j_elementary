package ru.job4j.аrrays;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[4];
        System.out.println("Array 1 length = " + ages.length);
        System.out.println("Array 2 length = " + surnames.length);
        System.out.println("Array 3 length = " + prices.length);
        System.out.println("Array 4 length = " + names.length);
        names[0] =  "Nic";
        names[1] = "Mike";
        names[2] = "Soul";
        names[3] = "Trevor";
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(names[3]);
    }
}
