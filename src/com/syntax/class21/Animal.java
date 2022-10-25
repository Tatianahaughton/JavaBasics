package com.syntax.class21;

public class Animal {

    String color;
    String name;
    String breed;
    void sleep() {
        System.out.println("Animals sleep 6 hrs");
    }
    void eat() {
        System.out.println("Grass and meat");
    }
}

class Cat extends Animal {

    void sleep() {
        System.out.println("I like to sleep 20 hrs");
    }
    void eat() {
        System.out.println("Cats like fish");
    }
}

class Dog extends Animal{
    void sleep() {
        System.out.println("I sleep 15");
    }

    void eat() {
        System.out.println("Dogs like meat");
    }
}
