package com.syntax.class29;

import java.util.HashMap;

public class EntrySetDemo {
    public static void main(String[] args) {
        HashMap<String, Double> items = new HashMap<>();
        items.put("Iphone 14", 1000.0);
        items.put("Eggs", 2.40);
        items.put("Apples", 3.50);
        items.put("Keyboard", 100.0);
        items.put("flower", 1.0);

        //Set<Map.Entry<String,Double>> entrySet=items.entrySet();
        var entrySet=items.entrySet();//var doesn't work with unnasigned variables, like instance
        System.out.println(entrySet);
    }
    }
