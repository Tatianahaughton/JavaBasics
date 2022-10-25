package com.syntax.class13;

public class IfStringEquals {
    public static void main(String[] args) {
//Equals method checks if Strings are exactly the 'same case'.

        String string="Shah";
        String str="Shah";
        String str2=new String("Shah");

        //if(string.equals(str)) {//same as if (string==str)

        if(string.equals("shah")) {//won't return because there's no lolwer case
            System.out.println("I fount it");
        }

            if(string.equalsIgnoreCase("shah")) {
            System.out.println("Found it haha");
        }
    }
}
