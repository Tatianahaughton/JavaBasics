package com.syntax.class13;

public class StringDemoReplace {
    public static void main(String[] args) {
        //Replace method,
        String str="Batch 14 is good81234!@#ASAGKL ghfkjghfg";
        System.out.println(str.replace("good", "Excellent"));//replaces one string with another
        System.out.println(str);//gives original input
        System.out.println(str.replaceAll("[a-z]", "&"));//replaces all chars with that specific attribute
        System.out.println("-----------------------");


        //System.out.println(arr2);
    }
}
