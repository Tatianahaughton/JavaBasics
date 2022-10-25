package com.syntax.class13;

public class StringCase {
    public static void main(String[] args) {
        //toupperCase or toLowerCase
        String str="dna";
        System.out.println(str.toUpperCase());//converts all letters to upper case.

        str="JAVA";
        System.out.println(str.toLowerCase());

        System.out.println("-----------------------");

        String string="hello";

        string.toUpperCase();
        System.out.println(string); //prints lower

        string=string.toUpperCase();//creates a new object
        System.out.println(string);//will print upper

        String firstName="Tatiana";
        String lastName="Haughton";
        System.out.println(firstName+" " +lastName);//preferred syntax to join strings
        System.out.println(firstName.concat(" ").concat(lastName));

        String string1="";//empty field unless you add space
        System.out.println(string1.isEmpty());//if Empty, returns true
        System.out.println(string1.isBlank());//
    }
}
