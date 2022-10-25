package com.syntax.class19;

public class Task2 {
        /*
 Write Book class that will have instance variables and 2 Constructors. While creating an object make sure:
Instance variables are being initialized
Both Constructors are being executed
     */

    public static void main(String[] args) {
        Books objj=new Books("KAthu","dada",12,12);
        new Books("fgfdgh","gdfsgdsg",12);
    }
}

class Books {
    String name;
    String author;
    int noOfTotalCh;
    int ISBN;
    //create a constructor for ISBN and the rest

    public Books(String name, String author, int noOfTotalCh, int ISBN) {
       /* this.name=name;
        this.author=author;
        this.noOfTotalCh=noOfTotalCh;*/
        this(name, author, noOfTotalCh);
        this.ISBN = ISBN;
    }

    public Books(String name, String author, int noOfTotalCh) {
        this.name = name;
        this.author = author;
        this.noOfTotalCh = noOfTotalCh;

    }
}
