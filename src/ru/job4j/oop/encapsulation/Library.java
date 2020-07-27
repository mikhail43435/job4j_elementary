package ru.job4j.oop.encapsulation;

import ru.job4j.аrrays.*;

public class Library {
    public static void main(String[] args) {
        Book book1 =  new Book();
        Book book2 =  new Book();
        Book book3 =  new Book();
        Book book4 =  new Book();
        book1.title = "Clean code";
        book1.pages = 564;
        book2.title = "Bible";
        book2.pages = 6634;
        book3.title = "Rex";
        book3.pages = 264;
        book4.title = "Test";
        book4.pages = 54;
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
        for (int i = 0; i < books.length ; i++) {
            if (books[i].title.equals("Clean code")) {
            //if (books[i].title == "Clean code") {
            //if (books[i].title == neededString) {
                System.out.println("Book \"Clean code\" has number  " + (i + 1)  + " in array");
            }
        }
    }

    public static void printLibrary(Book[] array) {
        System.out.println("=== Printing library content");
        for (int i = 0; i < array.length; i++) {
            System.out.println("Book № " + i + "   title: " + array[i].title
                    + "   pages: " + array[i].pages
            );
        }
    }

}
