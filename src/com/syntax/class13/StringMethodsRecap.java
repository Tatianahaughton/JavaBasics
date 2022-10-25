package com.syntax.class13;

import java.util.Arrays;

public class StringMethodsRecap {
    public static void main(String[] args) {
        String str="kgjfhdADHK3456!#@$%"; {
           str=str.replaceAll("[^a-z]","");//leave out everything but lower case letters
            System.out.println("str = " + str);


            String sentence="Batch 14 is Great.Batch 14 is excellent.Batch 14 is just amazing";
            String[] split = sentence.split("[.!]");
            System.out.println("split = " + Arrays.toString(split));//use alt enter to get help code

            String str2="Batch 14 is Great.Batch 14 is excellent.Batch 14 is just amazing";
            String replace=str2.replaceFirst("Great","Good");
            System.out.println(replace);
        }
    }
}
