package com.syntax.class19;

public class Furniture {
    String color="green";
}

class Chair extends Furniture {
    String color="red";

    void printColor() {
        System.out.println(color);//will print local var-black
        System.out.println(this.color);//will print instance var from same class //red
        System.out.println(super.color);//prints instance var from parent

    }
}

class TestChair {
    public static void main(String[] args) {
        Chair chair=new Chair();
        chair.printColor();
    }
}
