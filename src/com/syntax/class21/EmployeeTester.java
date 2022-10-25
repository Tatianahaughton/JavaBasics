package com.syntax.class21;

public class EmployeeTester {
    public static void main(String[] args) {
        OfficeBoy boy=new OfficeBoy();
        boy.calculateSalary();//coming from parent class since Officeboy has no method

       Tester testBoy=new Tester();
        testBoy.calculateSalary();//coming from child class which its in

        Developer devBoy=new Developer();
        devBoy.calculateSalary();//coming from its own?
    }
    }

