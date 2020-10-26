package test.java.main.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p;           // сумма полуперимера
        p = (a + b + c) / 2;  // вычеслим сумму полупериметра
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}