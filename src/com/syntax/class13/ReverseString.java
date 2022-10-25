package com.syntax.class13;

public class ReverseString {
    public static void main(String[] args) {

        //Reversing a string with StringBuilder and reverse method

        //Use CharAt

        String sentence = "Jamaica";

        for (int i =sentence.length()-1; i >= 0; i--) {
            System.out.println(sentence.charAt(i));
        }
        System.out.println("----------------------------------");

        String str="hello";
        String newString="";
         for(int i=str.length()-1; i>2;i--) {
            newString=newString+str.charAt(i);//made a newString as each character of str"hello".
         }
        System.out.println(newString);
         //Reversing with Stringbuilder(mutable sequence of characters)//Has reverse method

        String s="Class is almost over";
         StringBuilder sb=new StringBuilder(s);
         sb.reverse();
        System.out.println(sb);

        String br="hello";
        System.out.println(br.length());
    }
    }

