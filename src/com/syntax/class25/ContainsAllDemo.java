package com.syntax.class25;

import java.util.ArrayList;

public class ContainsAllDemo {
    public static void main(String[] args) {

        ArrayList<String> beautyProducts = new ArrayList<>();
        beautyProducts.add("Blush");
        beautyProducts.add("Mascara");
        beautyProducts.add("lipstick");
        beautyProducts.add("Highlighter");
        beautyProducts.add("shampoo");
        beautyProducts.add("lotion");
        beautyProducts.add("conditioner");
        beautyProducts.add("Dove soap");

        //System.out.println(beautyProducts.contains("lipstick"));
        System.out.println();

        ArrayList<String> cosmetics=new ArrayList<>();
        cosmetics.add("Dove soap");
        cosmetics.add("shampoo");
        cosmetics.add("lotion");
        cosmetics.add("conditioner");

        System.out.println(beautyProducts.containsAll(cosmetics));

    }
}
