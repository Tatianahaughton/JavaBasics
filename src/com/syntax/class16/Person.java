package com.syntax.class16;

public class Person {

  private String password;//can't be accessed anywhere but inside this class . No other classes will access this
double salary=1000;//var salary can only be accesssed by classes within the same package.
    public static void main(String[] args) {
        Person person1=new Person();

        System.out.println(person1.password);
        System.out.println(person1.salary);
    }

}
