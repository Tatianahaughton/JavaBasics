package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
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

        Iterator<String> iterator = beautyProducts.iterator();
        System.out.println(beautyProducts.size());

//check hasNext before calling next method bc hasNext tells you of the next elements only
        while (iterator.hasNext()) {
            System.out.println(iterator.next());//calling it twice might not work on odd nums of elements
            System.out.println(iterator.next());
        }

        System.out.println(beautyProducts);

    }
}



