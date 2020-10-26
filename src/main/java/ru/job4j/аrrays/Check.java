package test.java.main.аrrays;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        boolean ideal = data[0];
        for (int i = 0; i < data.length; i++) {
            if (data[i] != ideal) {
                result = false;
                break;
            }
        }
        return result;
    }
}