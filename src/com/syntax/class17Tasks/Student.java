package com.syntax.class17Tasks;

public class Student {
    String name;
    double score1;
    double score2;
    double score3;
    double average;

    public Student(String stuName, double firstScore, double secondScore, double thirdScore) {
        name = stuName;
        score1 = firstScore;
        score2 = secondScore;
        score3 = score3;
    }
        public void calculateAverageGrade () {
            average=score1 + score2 + score3/ 3;
            System.out.println("Average grade for "+name+" is "+average);
        }
    }














