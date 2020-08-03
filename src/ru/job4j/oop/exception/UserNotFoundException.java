package ru.job4j.oop.exception;

public class UserNotFoundException  extends ElementNotFoundException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
