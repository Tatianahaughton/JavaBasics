package com.syntax.class17;

public class EmpTester {
    public static void main(String[] args) {
        Employee emp1=new Employee("Josh","IT",120000,25);//accessing an object in another class thru a  constructor from an Employee class
        emp1.printSalary();
        emp1.calculatePrintTax();
    }

  //  AccessModifiers obb=new AccessModifiers("Tatiana","clerk","Accounting");
}
