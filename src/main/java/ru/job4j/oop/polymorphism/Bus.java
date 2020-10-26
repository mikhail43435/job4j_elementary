package test.java.main.oop.polymorphism;

public class Bus implements Transport{

    @Override
    public void ride() {
        System.out.println("We are riding!");
    }

    @Override
    public void passengers(int number) {
        System.out.println("Number of passengers areL: " + number);
    }

    @Override
    public int gasUp(int amount) {
        int  price = 12;
        return amount * price;
    }
}
