package ru.job4j.oop.encapsulation;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int startPosition) {

        for (int index = startPosition; index < products.length; index++) {
            if (index != products.length - 1) {
                products[index].setName(products[index + 1].getName());
                products[index].setCount(products[index + 1].getCount());
            } else {
                products[index] = null;
            }
        }
        return products;
    }
}