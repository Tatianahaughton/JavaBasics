package com.syntax.class14B;

public class SwapStrings {
    public static void main(String[] args) {
                       //Swapping Strings with substring method

        String str="Hello";
        String str2="Hi";

        str+=str2;
        str2=str.substring(0,str.length()-str2.length());
        str=str.substring(str2.length());

        System.out.println(str);
        System.out.println(str2);
    }
}
