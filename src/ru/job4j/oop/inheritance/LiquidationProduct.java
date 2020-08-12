package ru.job4j.oop.inheritance;

public final class LiquidationProduct extends Product {
    public LiquidationProduct(String name, int price) {
        super(name, price);
    }

    @Override
    public int discount() {
        return 90;
    }
}