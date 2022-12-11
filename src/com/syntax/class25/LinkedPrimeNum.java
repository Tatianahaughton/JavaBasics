package com.syntax.class25;

import java.util.LinkedList;
import java.util.List;

public class LinkedPrimeNum {
    public static void main(String[] args) {

        LinkedList<Integer> linkedList = new LinkedList<>();
        for (int i = 2; i <= 100; i++) {
            linkedList.add(i);

            LinkedPrimeNum obj = new LinkedPrimeNum();
            //  obj.isPrime(linkedList);
            List<Integer> nums = new LinkedList<>(linkedList);
            System.out.println(nums);


        }
    }
}


   // public List checkPrime(List<Integer> list) {
       // boolean isPrime;
      //  for (int i = 2; i <= list.size(); i++) {
        //    if (i % i == 0) ;
//        }

   // }


          //  return isPrime;







