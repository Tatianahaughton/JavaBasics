package com.syntax.class25;

import java.util.Iterator;
import java.util.LinkedList;

public class linkedList {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();

        for (int i = 50; i < 100; i++) {
            linkedList.add(i);
        }

        Iterator<Integer> iterator = linkedList.iterator();

        while (iterator.hasNext()) {
            int item = iterator.next();//create a var to store elements in
            if (!(item % 3 == 0)) {
                iterator.remove();
            }
        }
        System.out.println(linkedList);
    }
}





