package com.syntax.class13;

public class IndexOf {
    public static void main(String[] args) {
                            //com.syntax.class13.IndexOf
        String str = "I want to go eat something";


        for(int i=0;i<str.length(); i++) {//
            if(str.charAt(i)=='o') {//looks for index with letter'o'.
                System.out.println(i);
            }
        }
        System.out.println(str.indexOf("a"));//gives index of the letter
        System.out.println(str.indexOf(" "));//gives index of space
        System.out.println();



        System.out.println("-----------------------");

        String strings="wonderful";
        char lastChar=strings.charAt(strings.length()-1);
        int index=strings.indexOf(lastChar);
        System.out.println(index);
        System.out.println(strings.indexOf('a'));
    }
    }

