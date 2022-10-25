package com.syntax.class14B;

import java.util.Arrays;

public class ReverseString {
    public static void main(String[] args) {
                                    //Reverse words ONLY in a string
        String sentence = "Who is ready for the Holidays?";

        String[] sentenceArr = sentence.split(" ");
        String reversedWord = "";

        for (int i = 0; i < sentenceArr.length; i++) {
            reversedWord = sentenceArr[i];

            for (int j = reversedWord.length() - 1; j >= 0; j--) {
                System.out.print(reversedWord.charAt(j));
            }
            System.out.print(" ");
        }
    }
}













