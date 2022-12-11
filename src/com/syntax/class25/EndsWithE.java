package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;

public class EndsWithE {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("Hello");
        words.add("Mane");
        words.add("Morning");
        words.add("Sane");
        words.add("Lame");

        Iterator<String> iterator = words.iterator();

        while (iterator.hasNext()) {
            String newWords = iterator.next();
            if (iterator.next().endsWith("e")) {
                iterator.remove();
            }
            System.out.println(newWords);

        }
    }
}
