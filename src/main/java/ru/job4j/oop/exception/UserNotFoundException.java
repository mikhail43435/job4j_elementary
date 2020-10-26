package test.java.main.oop.exception;

public class UserNotFoundException  extends ElementNotFoundException {
    public UserNotFoundException(String message) {
        super(message);
    }
}
