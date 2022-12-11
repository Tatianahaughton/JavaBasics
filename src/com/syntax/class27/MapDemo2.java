package com.syntax.class27;

import java.util.LinkedHashMap;

public class MapDemo2 {
    public static void main(String[] args) {
        //Maintains insertion order
        LinkedHashMap<String,Double> beautyProducts=new LinkedHashMap<>();
        beautyProducts.put("Foundation",50.5);
        beautyProducts.put("Blush",20.0);
        beautyProducts.put("Mascara",12.0);
        beautyProducts.put("Lipstick",17.0);

        LinkedHashMap<String,Double> cosmetics=new LinkedHashMap<>();
        cosmetics.put("Soap",5.00);
        cosmetics.put("Conditioner",8.00);
        cosmetics.put("Shampoo",9.00);

        LinkedHashMap<String,Double> grocery=new LinkedHashMap<>();
        grocery.putAll(beautyProducts);
        System.out.println(grocery);
        grocery.putAll(cosmetics);
        System.out.println(grocery);
        grocery.clear();
        System.out.println(grocery);

    }
}
