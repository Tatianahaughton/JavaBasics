package com.syntax.class13;

public class Math {
    void add(int num1,int num2) {
        System.out.println(num1+num2);//defining the function for add method
    }
    void printFiboSeries(int size) {

        int previous=0;
        int currentNum=1;
        int nextNum=0;
        System.out.println(previous);
        System.out.println(currentNum);

        for(int i=0; i<size;i++) {
            nextNum=previous+currentNum;
            System.out.println(nextNum);
            previous=currentNum;
            currentNum=nextNum;
        }
    }

    public static void main(String[] args) {
        Math obj=new Math();
        obj.printFiboSeries(5);
        System.out.println("----------");
       obj.printFiboSeries(10);

        System.out.println("-----------------------------------");

        obj.add(10,20);

    }
}
