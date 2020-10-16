package ru.job4j.oop.polymorphism.cast;

public class Train implements Vehicle {
    @Override
    public void move() {
        System.out.println("Puh... poh...");
    }
}
