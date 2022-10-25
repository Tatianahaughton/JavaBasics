package com.syntax.class19;

public class Circle extends ShapeClass {

    Circle(double num1) {

        super(num1);
    }

    public static void main(String[] args) {
        Circle circle=new Circle(10);
        circle.findArea();
    }
}
