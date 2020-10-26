package test.java.main.collection;

import java.util.HashMap;

public class UsageMap {
    public static void main(String[] args) {
        HashMap<String, String> collection = new HashMap<>() {
            {
                put("email 1", "Sok");
                put("email 1", "Per");
                put("email 2", "Ded");
                put("email 4", "Ver");
            }
        };
        collection.put("email 5", "Top");
        for (String key : collection.keySet()) {
            System.out.println(collection.get(key));
        }
    }
}
