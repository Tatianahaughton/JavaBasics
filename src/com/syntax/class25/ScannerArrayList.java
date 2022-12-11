package com.syntax.class25;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class ScannerArrayList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Numbers in");
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());
        numbers.add(scan.nextInt());

        for(Integer nums:numbers){
            System.out.print(nums+" ");
        }
        System.out.println("----------Another way------------------");

        for (int i = 0; i < 5; i++) {
            numbers.add(scan.nextInt());
        }
            Iterator<Integer> it=numbers.iterator();
            while(it.hasNext()) {
                System.out.print(it.next()+" ");
            }
        }
    }



