package com.syntax.class15;

public class GiveGradeMethod {
    //Accept score from a student and return a grade

    char getGrade(int score) {
        char grade;
        if (score > 90) {
            grade = 'A';
        } else if (score > 80) {
            grade = 'B';
        } else if (score > 70) {
            grade = 'C';
        } else if (score > 50) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        return grade;
    }

    public static void main(String[] args) {
        GiveGradeMethod obj=new GiveGradeMethod()
;
        System.out.println(obj.getGrade(81));}
}

