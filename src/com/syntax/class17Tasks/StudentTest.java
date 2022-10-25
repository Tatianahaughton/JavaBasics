package com.syntax.class17Tasks;

public class StudentTest {

    public static void main(String[] args) {
        Student obj = new Student("Tatiana", 77, 67, 34);
        obj.calculateAverageGrade();

        Student obj2 = new Student("Tanya", 56, 34, 87);
        obj2.calculateAverageGrade();

        Student obj3 = new Student("Kelly", 89, 67, 87);
        obj3.calculateAverageGrade();

        Student obj4 = new Student("Sasha", 56, 67, 87);
        obj4.calculateAverageGrade();

        Student obj5 = new Student("Lena", 34, 23, 44);
        obj5.calculateAverageGrade();
    }
}
