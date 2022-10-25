package com.syntax.class13;

public class EndsWith {
    public static void main(String[] args) {
        String str2="Java is very easy";
        System.out.println(str2.startsWith("J"));
        System.out.println(str2.endsWith("y"));

        String s1="hello how are you";
        System.out.println(s1.endsWith("u"));
        System.out.println(s1.endsWith("world"));
        System.out.println(s1.endsWith("are"));
        System.out.println(s1.endsWith("you"));

        //System.out.println(str2.contains("very"));
        //Changing methods:
        System.out.println(str2.toLowerCase().contains("very"));//convert to lower then check if true or not.
    }
}
