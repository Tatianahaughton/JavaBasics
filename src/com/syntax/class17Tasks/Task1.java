package com.syntax.class17Tasks;

public class Task1 {

    public String name;
    String country;
    int age;

    Task1(String str, String str2, int ageNum) {
        name = str;
        country = str2;
        age = ageNum;

        System.out.println("My name is " + name + ", I was " + age + " when I came to US from " + country);
    }

    Task1() {
        System.out.println(" Empty");
    }
}


