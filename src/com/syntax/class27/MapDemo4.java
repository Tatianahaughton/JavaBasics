package com.syntax.class27;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapDemo4 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 3.99);
        fruit.put("Mango", 2.99);
        fruit.put("Oranges", 4.99);
        fruit.put("Bananas", 1.99);

        //keySet() method returns a set out of all keys that are in a hash map

        Set<String> allKeys = fruit.keySet();
        System.out.println(allKeys);

        Iterator<String> iterator = allKeys.iterator();//Getting a iterator on that set

        while (iterator.hasNext()) {
            String item = iterator.next();
            if (item.contains("n")) {
                iterator.remove();
            }
        }
        System.out.println(fruit);
    }
}

