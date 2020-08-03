package ru.job4j.oop.exception;

public class FindEl extends Exception {
    public static int indexOf(String[] value, String key) throws ElementNotFoundException  {
        int result = -1;
        for (int index = 0; index < value.length; index++) {
            if (value[index].equals(key)) {
                result = index;
                break;
            }
        }
        if (result == -1) {
            throw new ElementNotFoundException("Element not found!!!");
        }
        return result;
    }

    public static void main(String[] args) throws ElementNotFoundException {
        FindEl find = new FindEl();
        String[] array = {"Vasya", "Kolya", "Sasha", "Ed", "Albert"};
        try {
            System.out.println(find.indexOf(array, "Ed"));
            System.out.println(find.indexOf(array, "E3d"));
        } catch (ElementNotFoundException e) {
            e.printStackTrace();
        }
    }

}