package com.syntax.class27;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo6 {
    public static void main(String[] args) {
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 3.99);
        fruit.put("Mango", 2.99);
        fruit.put("Oranges", 4.99);
        fruit.put("Bananas", 1.99);

        //Entry is a class that holds keys and values
        Set< Map.Entry<String, Double>> entrySEt= fruit.entrySet();//returns oa set of entries
        System.out.println(fruit);

    }
}
