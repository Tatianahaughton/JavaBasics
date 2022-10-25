package com.syntax.class14;

public class ReversedCheckIf {
    public static void main(String[] args) {
        String str="dad";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        if(stringBuilder.toString().equals(str)) {
            System.out.println("The string is palindrome");
            }else {
            System.out.println("Palindrome");
        }
    }
}
