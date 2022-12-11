package com.syntax.class25;

import java.util.ArrayList;

public class IteratorDemo4Lambda {
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

        beautyProducts.removeIf(item-> item.startsWith("B"));
        System.out.println(beautyProducts);
    }
    }


