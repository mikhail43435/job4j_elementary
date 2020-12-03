package ru.job4j.oop.polymorphism.cast;

public class Bus implements Vehicle {
    @Override
    public void move() {
        System.out.println("Bus is moving...");
    }
}
