package com.syntax.class19;

public class Bird {//parent class
    String name;
    String color;
    int age;
    double weight;

    Bird(String name, String color, int age,double weight) {//parent constructor
        this.name=name;
        this.color=color;
        this.age=age;
        this.weight=weight;
    }
    void printInfo() {
        System.out.println("Name " + name + " color " + color + " weight " + weight);
    }
}
//Bird class ends here
class Parrot extends Bird {//
    Parrot(String name, String color, int age, double weight) {
        super(name,color,age,weight);//add super and add the constructors from parent class
    }
}

class Crow extends Bird {

    Crow(String name, String color, int age, double weight) {

        super(name,color,age,weight);
    }
}

class Sparrow extends Bird {
    Sparrow(String name, String color, int age, double weight) {
        super(name, color, age, weight);
    }
}
        class Test {//optional class for our Syntax example/do not need a class for main metghod
            public static void main(String[] args) {
                Parrot parrot = new Parrot("Seki", "green", 2, 1);
                parrot.printInfo();

                Parrot crow = new Parrot("crow", "gold", 3, 4);
                crow.printInfo();

                Parrot sparrow = new Parrot("sparrow", "black", 3, 4);
                sparrow.printInfo();

            }
        }




