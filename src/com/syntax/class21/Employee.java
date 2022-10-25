package com.syntax.class21;

//Creating a method in parent class

public class Employee {
    String name;
    double baseSalary=40000;
    double bonus=20000;

    void calculateSalary() {
        System.out.println("1");
    }
}
//Creating same name method in child class

class Developer extends Employee {

    void calculateSalary() {
        System.out.println(2*baseSalary+(1.5*bonus));
    }
}
//Creating same name method with diff parameters

class Tester extends Employee {
    void calculateSalary() {
        System.out.println(baseSalary+(2*bonus));
    }
}

class OfficeBoy extends Employee {//this obj will be getting method from parent
}
