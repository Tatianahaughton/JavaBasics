package com.syntax.class25;

import java.util.ArrayList;

public class RemoveAllDemo {
    public static void main(String[] args) {
        ArrayList<String> makeUpItem=new ArrayList<>();
        makeUpItem.add("Blush");
        makeUpItem.add("Base");
        makeUpItem.add("concealer");
        makeUpItem.add("Mascara");
        makeUpItem.add("eyeLinear");
        makeUpItem.add("lipstick");


        ArrayList<String> itemsToBeRemoved=new ArrayList<>();
        itemsToBeRemoved.add("Blush");
        itemsToBeRemoved.add("Base");
        itemsToBeRemoved.add("concealer");
        itemsToBeRemoved.add("Josh");

        makeUpItem.removeAll(itemsToBeRemoved);
        // makeUpItem.clear();  // it removes everything
        System.out.println(makeUpItem);

        System.out.println("------------------------------------------");
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(111);
        numbers.add(222);
        numbers.add(333);
        numbers.add(444);
        numbers.add(555);
        numbers.add(666);
        System.out.println(numbers);
        numbers.clear();
        System.out.println(numbers);

    }
}

