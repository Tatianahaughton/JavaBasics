package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo {
    //Iterator is like an interaface
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

        //getting the iterator from the list
        //hasNext-gives true or false if elements are present
        //next()-moves pointer to next

      Iterator<String> iterator=beautyProducts.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());//gives item and removes the items from iterator
        System.out.println(iterator.hasNext());
        iterator.next();
        iterator.next();
        System.out.println(iterator.next());

       // while(iterator.hasNext()) {
           // System.out.println(iterator.next());
        }

        }


