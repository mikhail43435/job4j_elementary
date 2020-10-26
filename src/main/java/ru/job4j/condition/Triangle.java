package test.java.main.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        return ((ab + ac) > bc) && ((ac + bc) > ab) && ((ab + bc) > ac);
    }

    public static void main(String[] args) {
        System.out.println(exist(23, 324, 324));
    }

}