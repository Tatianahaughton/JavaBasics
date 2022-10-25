package com.syntax.class19;

public class YellowFruits extends Fruits {
   boolean organic;

    YellowFruits(String name, boolean isTropical, String color,boolean organic) {
        super(name, isTropical,color);
        this.organic = organic;
    }

    public static void main(String[] args) {//using static method from parent class Fruits
        YellowFruits.printF();
    }
}

