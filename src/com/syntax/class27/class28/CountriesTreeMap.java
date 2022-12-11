package com.syntax.class27.class28;

import java.util.Map;
import java.util.TreeMap;

public class CountriesTreeMap {

    /*Create a map of countries with its capital that will store countries in alphabetical order.
Print all keys and values from a country map using for each loop and iterator.
Print all values from a country map using for each loop and iterator.*/

    public static void main(String[] args) {
        Map<String, String> countries = new TreeMap<>();
        countries.put("Russia", "Moscow");
        countries.put("France", "Paris");
        countries.put("Italy", "Rome");
        countries.put("Switzerland", "Bern");

        var country = countries.entrySet();

        for (var c : country) {
            System.out.println(c.getKey()+" "+c.getValue());
        }

        System.out.println("-----------------------------------");
        var iterator = countries.entrySet().iterator();

        while (iterator.hasNext()) {
            var country1 = iterator.next();
            var key = country1.getKey();
            var values = country1.getValue();
            System.out.println(country1);
        }
        var country2=countries.values().iterator();
    }
}



