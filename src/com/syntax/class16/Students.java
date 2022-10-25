package com.syntax.class16;

public class Students {
    //
String name;
String id;
 static int numberOfStudents;//answer is 1 without static variable

    public static void main(String[] args) {
        Students roman=new Students();
        roman.id="1";
        roman.name="Roman";
        roman.numberOfStudents++;//++ will work here bc its an itg, int numOfStudents is 0 so 0++.

        Students tanya=new Students();
        tanya.id="2";
        tanya.name="Sonam";
        tanya.numberOfStudents++;//++ will wor here bc its an itg, int numOfStudents is 0 so 0++
        System.out.println(Students.numberOfStudents);//don't have to use the obj name to print//tanya.numberOfStudents
        System.out.println(Students.numberOfStudents);
    }

}
