package com.syntax.class32;

public class ByZeroException {
    public static void main(String[] args) {
        int a=10, b=0, result;

        try {
            result = a/b; ;
        }
        catch(ArithmeticException e) {
            System.out.println("/ by zero");
        }
    }
}

