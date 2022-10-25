package com.syntax.class15;

public class PrintIfPalindromeMethod {
    //Create a method that will print if given String is palindrome or not.

    boolean isPalindrome;

    void printPalindrome (String str) {
        str=str.toLowerCase();
        StringBuilder strbldr=new StringBuilder(str);
        strbldr.reverse();
        if(strbldr.toString().equals(str)) {
            System.out.println("Palindrome");
        }else {
            System.out.println("Not palindrome");
        }
    }

    public static void main(String[] args) {
        PrintIfPalindromeMethod sub= new PrintIfPalindromeMethod();
        sub.printPalindrome("Dad");
        sub.printPalindrome("Thor");
        }
    }

