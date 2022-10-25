package com.syntax.class19;

public class Teacher {
    String name;
    boolean isStrict;
    int yearsWorked;
    Teacher(String name, boolean isStrict, int yearsWorked) {
        this.name = name;
        this.isStrict = isStrict;
        this.yearsWorked = yearsWorked;
    }
    void print() {
        if (isStrict == true) {
            System.out.println("My teacher's name is " + name + ", years worked: " + yearsWorked + ", and this teacher is strict.");
        } else {
            System.out.println("My teacher's name is " + name + ", years worked: " + yearsWorked + ", and this teacher is nice.");
        }
    }
    public static void main(String[] args) {
        Teacher teacher=new Teacher("Larissa",true,12);
        teacher.print();
    }
}
