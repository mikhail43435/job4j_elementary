package test.java.main.oop.encapsulation;

public class ShopDrop {
    public static Product[] leftShift(Product[] products, int startPosition) {

        for (int index = startPosition; index < products.length; index++) {
            if (index != products.length - 1) {
                products[index] = products[index + 1];
            } else {
                products[index] = null;
            }
        }
        return products;
    }
}