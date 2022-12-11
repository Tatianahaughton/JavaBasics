package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class DrinksContains {
    public static void main(String[] args) {

        //Create an array of drinks. Any drinks containing"a" or "e" replace with water
        ArrayList<String> drinks = new ArrayList<>();
        drinks.add("Pepsi");
        drinks.add("Lemonade");
        drinks.add("Milk");
        drinks.add("Tea");

        Iterator<String> iterator = drinks.iterator();
//when we're updating, cant use for loop

        while (iterator.hasNext()) {
            String drinks2 = iterator.next();
            if(drinks2.contains("a")||drinks2.contains("e")) {
                System.out.println("water");
            }else {
                System.out.println(drinks2);
            }
            //Another method
            for(int i=0; i<drinks.size();i++) {
                if(drinks.get(i).contains("a")||drinks.get(i).contains("e")) {
                    System.out.println(drinks.set(i,"Water"));
                }
            }
        }
    }

}
