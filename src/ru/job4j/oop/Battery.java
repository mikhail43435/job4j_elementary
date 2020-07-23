package ru.job4j.oop;

public class Battery {
    private int load;

    public void exchange(Battery another) {
        another.load = another.load + this.load;
        this.load = 0;
    }

    public static void main(String[] args) {
        Battery battery1 = new Battery();
        Battery battery2 = new Battery();
        battery1.load = 67;
        battery2.load = 21;
        System.out.println("Заряд батареи 1 составляет " + battery1.load + " %, заряд батареи 2 составляет " + battery2.load + " %");
        battery2.exchange(battery1);
        System.out.println("Заряд батареи 1 составляет " + battery1.load + " %, заряд батареи 2 составляет " + battery2.load + " %");
    }
}
