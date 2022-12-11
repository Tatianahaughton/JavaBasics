package com.syntax.class31;

public class ExceptionDemo3 {
    public static void main(String[] args) {
        try{
            String name=null;//telling java to try this code to see of any exception happen
            System.out.println(name.length());//lines that contain issues
        }
        catch(Exception anibar) {//put the possible errors in ()
            System.out.println("Back up code");//execute this block code if anything goes on int the try method
        }

        System.out.println("Code 1");
        System.out.println("Code 2");
        System.out.println("Code 3");
        System.out.println("Code 4");
    }
}
