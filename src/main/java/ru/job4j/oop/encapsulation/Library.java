package ru.job4j.oop.encapsulation;

import ru.job4j.аrrays.*;

public class Library {
    public static void main(String[] args) {
        Book book1 =  new Book("Clean code", 454);
        Book book2 =  new Book("Not clean code", 8798);
        Book book3 =  new Book("Easy clean code", 32);
        Book book4 =  new Book("Crazy clean code", 302);
        Book[] books = new Book[4];
        books[0] = book1;
        books[1] = book2;
        books[2] = book3;
        books[3] = book4;
        printLibrary(books);
        SwitchArray.swap(books, 0, 2);
        printLibrary(books);
        System.out.println(System.lineSeparator());
        //String neededString = "Clean code";
        for (int i = 0; i < books.length; i++) {
            if (books[i].getTitle().equals("Clean code")) {
            //if (books[i].title == "Clean code") {
            //if (books[i].title == neededString) {
                System.out.println("Book \"Clean code\" has number " + (i + 1)  + " in library");
            }
        }
    }

    public static void printLibrary(Book[] array) {
        System.out.println("=== Printing library content");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Book № " + (i + 1) + "   title: " + array[i].getTitle()
                    + "   pages: " + array[i].getPages()
            );
        }
    }

}
