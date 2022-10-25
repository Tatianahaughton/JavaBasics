package com.syntax.class17;

public class Dog {
    private String name;
    private String breed;
    private String color;
    private int age;
    private double weight;

    //Making a constructor
    Dog(String dogName, String dogBreed, String dogColor, int dogAge, double dogWeight) {
        name = dogName;
        breed = dogBreed;
        color = dogColor;
        if(dogAge>30) {
            System.out.println("Enter a valid value");
        }else {
            age = dogAge;
        }
        weight = dogWeight;
    }
        void printInfo() { System.out.println("Name is " + name + " age " + age);}

            public static void main (String[] args) {
        /*Dog doggie=new Dog();
        doggie.name="Tommy";
        doggie.breed="Husky";
        doggie.color="Black";
        doggie.weight=30;
        doggie.age=10;*/
                Dog doggie = new Dog("Tommy", "Husky", "black", 10, 30);
                doggie.printInfo();

        /*Dog dog=new Dog();
        dog.name="Tom";
        dog.breed="Hus";
        dog.color="white";
        dog.weight=35;
        dog.age=12;*/
                Dog dog = new Dog("benji", "husky", "pink", 10, 35);
                dog.printInfo();
            }
        }



