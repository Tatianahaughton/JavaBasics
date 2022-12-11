package com.syntax.class26;

import java.util.TreeSet;

public class AlphabeticalRetrievalSet {
    public static void main(String[] args) {
        TreeSet<String> countries = new TreeSet<>();
        countries.add("USA");
        countries.add("Russia");
        countries.add("Jamaica");
        countries.add("Brazil");
        countries.add("Nigeria");
        System.out.println(countries);

        for (var name : countries) {
            System.out.println(name);
        }
    }
}
