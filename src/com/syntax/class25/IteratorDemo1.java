package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo1 {
    public static void main(String[] args) {
        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Highlighter");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("conditioner");
        beautyProducts.add("eye liner");
        beautyProducts.add("primer");
        beautyProducts.add("concealer");
        beautyProducts.add("base");

        Iterator<String> iterator=beautyProducts.iterator();

        while(iterator.hasNext()) {
           String item= iterator.next();//create a var to store elements in
            if(item.endsWith("r")) {
              iterator.remove();

                }
            }
        System.out.println(beautyProducts);
        }
    }

