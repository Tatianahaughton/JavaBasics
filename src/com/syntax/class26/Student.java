package com.syntax.class26;
import java.util.HashSet;
public class Student {
        String name;
        int id;
        Student(String name, int id){
            this.name=name;
            this.id=id;
        }
        void display() {
            System.out.println(name+" id: "+id);
        }
    public static void main(String[] args) {
        HashSet<Student> studentName = new HashSet<>();
        studentName.add(new Student("Tatiana", 1234));
        studentName.add(new Student("John", 3456));
        studentName.add(new Student("Anna", 5643));
        studentName.add(new Student("Adelina", 4532));
        studentName.add(new Student("Ayden", 5673));
        System.out.println(studentName);

        for(var student:studentName){
            student.display();
        }
    }
    }

