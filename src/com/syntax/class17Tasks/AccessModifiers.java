package com.syntax.class17Tasks;

public class AccessModifiers {

    String name;
    String occupation;
    int years;
    private int socialNum;
    String empID;
    String dept;

    public AccessModifiers(String yourName, String job,String department, String id) {
        name = yourName;
        occupation = job;
    }

    private AccessModifiers(int ssn, int yearsWorked) {
        socialNum = ssn;
        years = yearsWorked;
    }


    AccessModifiers () {
        System.out.println("default");
    }

    void print() {
        System.out.println();
    }

    public static void main(String[] args) {
        AccessModifiers object = new AccessModifiers(2134321234, 12);
        //AccessModifiers obj=new AccessModifiers("1234","Accounting");
        //AccessModifiers objj=new AccessModifiers("Tatiana","clerk");
    }
}










