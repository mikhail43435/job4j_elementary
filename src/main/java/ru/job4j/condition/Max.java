package test.java.main.condition;

public class Max {
    public static int max(int first, int second) {
        int result = first > second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {
        return max(max(first, second), third);
    }

    public static int max(int first, int second, int third, int fourth) {
        return max(max(max(first, second), third), fourth);
    }

    public static void main(String[] args) {
        System.out.println(max(21, 11));
    }
}