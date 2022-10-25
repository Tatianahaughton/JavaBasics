package com.syntax.class18;

public class Car {
    String make;
    String model;
    String color;
    double price;
    int topSpeed;

    void printCarDetails() {
        System.out.println("model " +model+" Make "+make+" Color " +color);
    }
}
class BMW extends Car {
    double engineCC;
}

class Toyota extends Car {

}
class Tesla {

}
class CarTester {
    public static void main(String[] args) {
        BMW bmw = new BMW();
        bmw.make="dsf";
        bmw.model = "x5M";
        bmw.color="White";
        bmw.printCarDetails();
    }
}
