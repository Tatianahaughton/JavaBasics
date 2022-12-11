package com.syntax.class27;

import java.util.Collection;
import java.util.HashMap;

public class MapDemo3 {
    public static void main(String[] args) {

        //Maps print out basesd on keys not values, so don't add same keys
        HashMap<String, Double> fruit = new HashMap<>();
        fruit.put("Apple", 3.99);
        fruit.put("Mango", 2.99);
        fruit.put("Oranges", 4.99);
        fruit.put("Bananas", 1.99);
        fruit.put("Bananas", 5.99);//replaces old value with the new one
        System.out.println(fruit);
        System.out.println(fruit.get("Banana"));

        Collection<String> keySet=fruit.keySet();//method that returns a set of all keys that are present in the map
        System.out.println(keySet);

        Collection<Double>values=fruit.values();//returns all values in the map
        System.out.println(values);

    }
    }
