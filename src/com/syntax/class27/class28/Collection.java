package com.syntax.class27.class28;

import java.util.LinkedHashSet;

public class Collection {
    /*Create the collection that will store single uniques Objects of a String type in which order is preserved.
Write a logic to concatenate all string from the collection.*/
    public static void main(String[] args) {


       LinkedHashSet<String> str = new LinkedHashSet();
        str.add("Hey");
        str.add("Good morning");
        str.add("It's another day");
        str.add("of Java");

        for(var string:str) {
            System.out.print(string+" ");
        }
    }
}

