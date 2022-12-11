package com.syntax.class25;
import java.util.ArrayList;
import java.util.Iterator;

public class IteratorEvenNums {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i <= 500; i += 2) {
            if (i % 2 == 0) {
                numbers.add(i);
            }
        }
        numbers.removeIf(nums -> nums % 5 == 0);
        {
            System.out.println(numbers);
        }
        System.out.println("---------------Using Iterator----------------------------");

        Iterator<Integer> iterator=numbers.iterator();

        while(iterator.hasNext()) {
            Integer x= iterator.next();
            if(x%5==0) {
                iterator.remove();
            }
        }
        System.out.println(numbers);
    }
}


