package com.syntax.class24;

import java.util.ArrayList;

public class Task1 {
    public static void main(String[] args) {
        //Create an ArrayList that will store 5 names into it.
        //Find out whether the given ArrayList is empty or not?
        //Check whether the specific name is present in an ArrayList or not?
        //Find the size of your arrayList and print all values from that.

        ArrayList<String> names = new ArrayList();
        names.add("Tatiana");
        names.add("Ayden");
        names.add("Myron");
        names.add("Adelina");
        names.add("Alana");

        //System.out.println(names);
        if(names.isEmpty()) {
            System.out.println("List can't be empty");
        }else {
            System.out.println("List isn't emplty");
        }

        if(names.contains("Tatiana")) {
            System.out.println("List contains Tatiana");
        }else {
            System.out.println("Tatiana isn't a name on the list");
        }

        System.out.println("Array list size is " +names.size()+names);



    }
}
