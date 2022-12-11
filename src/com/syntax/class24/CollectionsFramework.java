package com.syntax.class24;

import java.util.ArrayList;
import java.util.Arrays;

public class CollectionsFramework {
    public static void main(String[] args) {

        //if we need to sotore a single value, use vatiables

    String name = "Tanya";
    String name2 = "Sasha";
    System.out.println(name);
    System.out.println(name2);

    //if we need to store multiple values of same kind, go with arrays

    String[] names = {"Tatiana", "Nadya", "Fedya"};

    //fixed in size

    String[] breeds = new String[10];//creating an array of size 10
    breeds[0]="Bulldog";//storing data inside an array
        System.out.println(Arrays.toString(breeds));

    ArrayList<String> colors = new ArrayList<>();
    colors.add("Green");
    colors.add("Red");
        System.out.println(colors.contains("Green"));
        System.out.println(colors);
}
}
