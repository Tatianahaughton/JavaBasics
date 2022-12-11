package com.syntax.class26;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;

public class Set {
    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(10);
        System.out.println(numbers);//prints all numbers

                    //HashSet is unordered&unsorted collection of data set
                    //does not allow duplicate numbers, will only print other nums
        HashSet<Integer> setNums=new HashSet<>();
        setNums.add(10);
        setNums.add(20);
        setNums.add(10);
        System.out.println(setNums);//prints [20,10]

                    //LinkedHashSet is ordered and sorted collection of HashSet
        LinkedHashSet<Integer> setNums2=new LinkedHashSet<>();
        setNums2.add(10);
        setNums2.add(20);
        setNums2.add(10);
        System.out.println(setNums2);//prints [10,20]

    }
}
