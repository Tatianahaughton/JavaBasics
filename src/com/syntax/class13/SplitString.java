package com.syntax.class13;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {
            //Split function returns array of strings String[]
        String str ="Batch 14 is really good";
        System.out.println(str);
                    //Creates an array based on spaces
        String []arr =str.split(" ");//
        System.out.println(Arrays.toString(arr));
        //System.out.println(arr[4]);//prints a word in [4] index

        //Creates an array based on sentences or just[.]

        String str2="Today is Sunday.Sunday is good. Java is also good.";
        String[] arr2=str2.split("[.]");
        System.out.println(Arrays.toString(arr2));

        String myStr="Today is a review class";
        String[] array=myStr.split(" ");
        System.out.println(array.length);//gives 5
        System.out.println(array[3]);//gives review

        //To access all elements use a for loop or enhanced

        for(int i=0; i<array.length; i++) {
            System.out.println(array[i]);
        }
                         //Enhanced loop
        for(String arr3:array){
            System.out.print(arr3);
        }
    }
}
