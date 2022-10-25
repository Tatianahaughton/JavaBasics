package com.syntax.class15;

public class PrintEvenMethod {
    //Create a method that will print if number is even or odd

    void printEvenOdd(int number) {
        if(number%2==0) {
            System.out.println(number+ " is even");
        }else {
            System.out.println(number+ " is odd");
        }
    }

    public static void main(String[] args) {
       PrintEvenMethod obj= new PrintEvenMethod();
        obj.printEvenOdd(45);
        obj.printEvenOdd(50);

    }
}
