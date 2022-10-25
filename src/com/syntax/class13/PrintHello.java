package com.syntax.class13;

public class PrintHello {
    //Method that doesn't take any parameters and prints lines on console
    void printHello () {//nothing in () so the return doesnt need to have anything in ()
        System.out.println("Hello World");
        System.out.println("Hello Java");
    }
    //A method that takes a single parameter of type String and prints it
    void printWord(String word) {
        System.out.println(word);
    }

    public static void main(String[] args) {
        PrintHello object=new PrintHello();
        object.printHello();//empty brackets
        object.printWord("Don't worry, itll be ok");
        object.printWord("yes see you tomorrow");
    }
}

