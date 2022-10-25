package com.syntax.class14;

public class SwapStrings {
    public static void main(String[] args) {

        //Swap strings without a temp variable

        String str="python";
        String str1="JAva";

        str=str+str1;

        str1=str.replace(str1,"");
        str=str.replace(str1,"");

        System.out.println(str);
        System.out.println(str1);
    }
}
