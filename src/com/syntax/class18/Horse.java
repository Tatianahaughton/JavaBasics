package com.syntax.class18;

public class Horse {

    //This keyword

    String name;
    String breed;
    int age;
    double weight;
    boolean canCook;

    public Horse(String name, String breed, int age, double weight) {
        this.name = name;
        this.breed = breed;
        this.weight = weight;
        this.age = age;
    }

    void printInfo() {
        System.out.println("name " + name + " breed " + breed + " age " + age + " weight " + weight);
    }

    public static void main(String[] args) {
        Horse obj = new Horse("Spirit", "Stallion", 20, 400);
            obj.printInfo();
        }
    }







