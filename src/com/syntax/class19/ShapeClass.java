package com.syntax.class19;

public class ShapeClass {
    double radius;
    double area;
    ShapeClass(double num1) {

        this.radius = num1;
    }
    double findArea() {
        area = 3.14 * radius * radius;
        System.out.println("Area of circle is " + area);
        return area;
    }
}









