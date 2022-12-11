package com.syntax.class25;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedSum {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(111);
        list.add(222);
        list.add(333);
        list.add(444);
        list.add(555);
        list.add(666);

    Iterator<Integer> iterator = list.iterator();
        int sum=0;
        while (iterator.hasNext()) {
            int num = iterator.next();
            sum += num;
        }
            System.out.println("Result of sum is "+sum);
        }

        }

