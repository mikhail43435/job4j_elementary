package ru.job4j.oop.polymorphism.cast;

public class Plane implements Vehicle {

    @Override
    public void move() {
        System.out.println("Flying...");
    }
}
