package com.syntax.class15;

import java.util.Scanner;

public class PrintLargerMethod {

    //Create a method that prints which is larger with 2 numbers

    void printLarger(int num,int num2) {
        if (num > num2) {
            System.out.println("Number 1 is larger " + num);
        } else if (num2 > num) {
            System.out.println("Number 2 is larger " + num2);
        } else {
            System.out.println("Numbers are equal");
        }
    }

        //to u se the method, we need main method and object, and name of class.

    public static void main(String[] args) {
        Scanner answer=new Scanner(System.in);
        System.out.println("Enter first number");
        int number= answer.nextInt();
        System.out.println("Enter second number");
        int number2= answer.nextInt();
        PrintLargerMethod object=new PrintLargerMethod();//creating obj of this class
        object.printLarger(number,number2);
        object.printLarger(12,35);//use the method we created with provided ()


    }
    }

