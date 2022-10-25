package com.syntax.class19;

public class Dog extends Animal {//use extends to get fields from parent class Animal

    public Dog(String name, String breed, String color) {
        super(name,breed,color);
        /* this.name=name;
        this.breed=breed;
        this.color=color;*/
    }

}
class Cat extends Animal {

    Cat(String name, String breed, String color) {
        super(name, breed, color);
    }

    class TestAnimal {
        public static void main(String[] args) {
        Dog dog = new Dog("hghjg", "hjghj", "hjgh");
    dog.printInfo();
    }

}



    public void printInfo() {
        System.out.println("Name "+name+" Breed "+breed+" color "+color);
    }
}
