package com.syntax.class14B;

public class PalindromeTask {
    public static void main(String[] args) {
        String str = "Noon";
        String reversed="";

        for (int i = str.length() - 1; i >= 0; i--) {
            reversed += str.charAt(i);
            System.out.print(str.charAt(i));
        }
        System.out.println();

        if (str.equalsIgnoreCase(reversed)) {
            System.out.println("This word is palindrome");
        } else {
            System.out.println("This word is not palindrome");
        }
    }
}
















