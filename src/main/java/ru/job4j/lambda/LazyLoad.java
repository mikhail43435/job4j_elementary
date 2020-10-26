package test.java.main.lambda;

import java.util.Arrays;
import java.util.Comparator;

public class LazyLoad {
    public static void main(String[] arg){
        String[] names = {
                "Ivan",
                "Masha"
        };
        Comparator<String> lengthCmp = (left, right) -> {
            System.out.println("code executing...");
            return left.length() - right.length();
        };
    Arrays.sort(names, lengthCmp);
    }
}
