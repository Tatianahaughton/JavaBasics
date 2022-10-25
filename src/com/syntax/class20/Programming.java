package com.syntax.class20;

public class Programming {
    String word;

       void printMessage() {
           System.out.println("I love programming languages");
       }

        void printMessage(String word) {
            System.out.println("I love "+word);

    }

    public static void main(String[] args) {
        Programming obj=new Programming();
        obj.printMessage();
        obj.printMessage("Java");
    }
}
