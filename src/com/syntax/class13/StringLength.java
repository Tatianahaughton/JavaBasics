package com.syntax.class13;

public class StringLength {
    public static void main(String[] args) {
        //Ways to make an object:
        String str=new String("Ja va");//proper way
        String name="Java dfghsdghdkjghskjhgkjlshdgkljh";//best way to create an object, only works with String and Wrapper classes?

                            //finding length of a string
        System.out.println(str.length());//counts number of all characters inside the string includng spaces//gives 5.
        System.out.println(name.length());//same output for String class object. Accessing methods not properties, need ()

        if(name.length()>15) {
            System.out.println("Name field shouldn't be more than 15 characters");
        }

        System.out.println("---------------------------");

        String str2="hello";
        int size=str2.length();
        System.out.println(size);
    }
}
