package com.syntax.class26;

import java.util.LinkedHashSet;

public class OrderedList {
    public static void main(String[] args) {
        LinkedHashSet<String> cities = new LinkedHashSet<>();
        cities.add("Annandale");
        cities.add("Manassas");
        cities.add("Fredericksburg");
        cities.add("Arlington");
        cities.add("Alama");
        cities.add("Stafford");

        System.out.println(cities);
        System.out.println("-----------------------");

        var iterator = cities.iterator();

        while (iterator.hasNext()) {
            var newList = iterator.next();
            if (newList.startsWith("A")) {
                iterator.remove();
            }
        }
            System.out.println(cities);
        }
    }

