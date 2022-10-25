package com.syntax.class19;

public class MathTeacher extends Teacher {
    String subject;
    int classSize;
    MathTeacher(String name,boolean isStrict, int yearsWorked,String subject,int classSize) {
        super(name,isStrict,yearsWorked);
        this.subject=subject;
        this.classSize=classSize;
    }

    void printOut() {
        System.out.println(name+" teaches "+subject+" with a class size of "+classSize);
    }

}
