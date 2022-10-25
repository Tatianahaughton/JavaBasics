package com.syntax.class13;

import java.util.Scanner;

public class BabyName {
    public static void main(String[] args) {

        String name1;
        String name2;
        String gender;

        Scanner answer=new Scanner(System.in);
        System.out.println("Enter your mom's name");
        name1=answer.next();


        System.out.println("Enter your dad's name");
        name2=answer.next();

        System.out.println("Is it a boy or a girl");
        gender=answer.next();


        if(gender.equals("boy")) {
            System.out.println("Baby's name should be " +name2.toUpperCase().substring(0,name2.length()/2)+name1.toUpperCase().substring(name1.length()/2));
        }else {
            System.out.println("Baby's name should be "+name1.toUpperCase().substring(0,name1.length()/2)+name2.toUpperCase().substring(name2.length()/2));
        }


    }
}
