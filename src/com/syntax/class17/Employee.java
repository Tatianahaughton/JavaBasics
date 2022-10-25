package com.syntax.class17;

public class Employee {
    private String name;
    private String department;
    private double salary;
    private String id;
    private int age;
    private double actualSalary;//declare this outside a method as instance,so we can use it in our method later

   static  String companyName="Syntax";//make it static since info won't change

    public Employee(String empName,String empDepart,double empSalary,int empAge) {
        name=empName;
        department=empDepart;
        salary=empSalary;
        age=empAge;

    }

    void printSalary() {
        actualSalary = salary + 20000 + 10000;//make actual salary an instance field so we can use it in calculate tax later
        System.out.println(actualSalary);
    }
    void calculatePrintTax() {
        double tax=actualSalary*.3;//now we can use this instance variable after converting from local
        System.out.println("tax "+tax);
    }

}
