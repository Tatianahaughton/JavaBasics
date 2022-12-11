package com.syntax.class31;

public class OutOfBoundsException {
    public static void main (String[] args) {
        try {
            int[] a = {1};
            System.out.println(a[4]);
        } catch (ArrayIndexOutOfBoundsException e){
          //  e.printStackTrace();
            System.out.println( " Write an easier message to understand");
        }

    }
}

