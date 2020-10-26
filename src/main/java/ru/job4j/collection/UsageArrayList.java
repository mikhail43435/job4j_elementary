package test.java.main.collection;

import java.util.ArrayList;

public class UsageArrayList {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<>();
        al.add(0, "Petr");
        al.add(1, "Ivan");
        al.add(2, "Stepan");
        for (String value : al) {
            System.out.println(value);
        }
        System.out.println("=== With GET");
        for (int index = 0; index < al.size(); index++) {
            System.out.println(al.get(index));
        }

    }
}
