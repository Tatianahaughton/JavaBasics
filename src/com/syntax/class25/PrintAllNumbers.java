package com.syntax.class25;

import java.util.ArrayList;

public class PrintAllNumbers {
    public static void main(String[] args) {
        ArrayList<Integer> numbers=new ArrayList();
        numbers.add(111);
        numbers.add(111);
        numbers.add(111);
        numbers.add(999);
        numbers.add(999);
        numbers.add(999);

        for(int i=0; i<numbers.size();i++){
            System.out.println(numbers.get(i));
        }
    }
}
