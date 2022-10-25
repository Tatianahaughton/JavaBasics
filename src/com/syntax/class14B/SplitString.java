package com.syntax.class14B;

import java.util.Arrays;

public class SplitString {
    public static void main(String[] args) {

        //How many sentences?Reverse string word by word

        String a = "Is it saturday? Is it raining? Do we have a Java class today?";

        String [] str= a.split("[?]");
        System.out.println(str.length);                 //3 sentences

        String [] str2= a.split(" ");
        System.out.println(str2.length);                //13 words

            }

        }













