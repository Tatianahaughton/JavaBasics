package com.syntax.class25;

import java.util.ArrayList;

public class WhyWeNeedIterator {
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


        //Don't use any loops with Array List-can change the list size. Use only if we need to retrieve an item not with add and remove methods.

        for (int i = 0; i < beautyProducts.size(); i++) {
            if (beautyProducts.get(i).endsWith("r")) {
                beautyProducts.remove(i);//not dependable loop/some items with'r' stay.*/

       /* for(String item:beautyProducts) {
            if(item.endsWith("r")) {
                beautyProducts.remove(item);
            }
        }

        */
                System.out.println(beautyProducts);
            }
        }
    }
    }

