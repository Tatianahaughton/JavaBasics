package com.syntax.class20;

public class StaticMethod {

      static void printMessage() {
         System.out.println("This is a static message");

     }
    void printMessage(String str, int num1) {
        System.out.println("This is a static message with a String," + str + ", and an integer :" + num1);

    }
    static void printMessage(int num1, int num2) {
        System.out.println("This is a static message with 2 integers "+num1+""+num2);
    }

}
