package com.syntax.class14B;

public class RemoveSpacesTask {
    public static void main(String[] args) {

        //Write a program to remove all spaces in a String

        String sentence = "It's almost Halloween!";

        System.out.println(sentence.replaceAll("\\s",""));
    }
}