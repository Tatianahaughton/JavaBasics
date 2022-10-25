package com.syntax.class13;

import java.util.Arrays;

public class CharArray {
    public static void main(String[] args) {
        //Converting string into a char array

        String str="I love java programming";
        char[] charArray=str.toCharArray();

        System.out.println(Arrays.toString(charArray));
        System.out.println(charArray[7]);//printing one char

        int counter=0;
        for(char c:charArray) {
            if(c=='a') {
                counter++;
            }
        }
        System.out.println("Letter a appeared " +counter+ " times");

        //Printing an array

        int[] arr={10,20,30};
        for(int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }

        //int[] arr2={10,20,30};
    }
}
