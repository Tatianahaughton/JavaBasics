package com.syntax.class27;

import java.util.HashMap;

public class MapDemo1 {
    public static void main(String[] args) {

        HashMap<String,Double> fruit=new HashMap<>();
        fruit.put("Apple",3.99);
        fruit.put("Mango",2.99);
        fruit.put("Oranges",4.99);
        fruit.put("Bananas",1.99);

        System.out.println(fruit);
        System.out.println(fruit.get("Oranges"));//gets price for only oranges
        fruit.remove("Mango");//removes mango from list
        System.out.println(fruit);
        System.out.println(fruit.containsKey("Apple"));//prints true or false
        System.out.println(fruit.containsKey("Kiwi"));
        System.out.println(fruit.containsValue(4.99));
        System.out.println(fruit.isEmpty());//checking if anything in there

        fruit.replace("Apple",2.99);//replces the price for Apple
        System.out.println(fruit);

    }
}
