package com.syntax.class20;

public class Area {
    int num1;
    int num2;
    int height;
    int areaRectangle;
    int areaSquare;
    int areaBox;

    public int findArea(int num1, int num2) {
        areaRectangle = num1 * num2;
        System.out.println("Area of a rectangle is =" + areaRectangle);
        return areaRectangle;
    }

    public int findArea(int num1) {
        areaSquare = num1 * num1;
        System.out.println("Area of a square is =" + areaSquare);
        return areaSquare;
    }
        public int findArea ( int num1, int num2,int height){
            this.height=height;
            areaBox = 2*(height * num1) + 2*(height * num2) + 2*(num1 * num2);
            System.out.println("Area of a box is =" + areaBox);
            return areaBox;
        }
    }









