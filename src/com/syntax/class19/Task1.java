package com.syntax.class19;

public class Task1 {
    public static void main(String[] args) {
        Student obj = new Student("Tatiana", "gfjkghfgkj");
        obj.displayInfo();
    }
}
    class Student {//another class
        String name;
        String address;

        //now constructor with no return type
        public Student(String name, String address) {
            this.name = name;//adding this to assign instance vars to local vars.
            this.address = address;
        }

        void displayInfo() {
            System.out.println("name " + name + " Address " + address);
        }
        }



