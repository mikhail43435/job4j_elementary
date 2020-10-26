package test.java.main.oop.polymorphism.cast;

public class VehicleManager {
    public static void main(String[] args) {
        Vehicle bus = new Bus();
        Vehicle plane = new Plane();
        Vehicle train = new Train();
        Vehicle[] vehicles = new Vehicle[]{bus, plane, train};
        for (Vehicle v :vehicles) {
            v.move();
        }
    }
}
