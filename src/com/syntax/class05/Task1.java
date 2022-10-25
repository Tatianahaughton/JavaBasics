package com.syntax.class05;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		Scanner answer=new Scanner(System.in);
		
		System.out.println("What score did you get for quiz");
		double score=answer.nextDouble();
		
		System.out.println("Enter you mid term grade");
		double midTerm=answer.nextDouble();
		
		System.out.println("Enter final score");
		double finalGrade=answer.nextDouble();
		
		double average;
		average=(score+midTerm+finalGrade)/3;
		
		String grade;
		
		if (average>=90 && average<=100) {
			grade=("A");
		}
		else if (average<=90 && average<=70) {
			grade=("B");
		}
		else if(average<=70 && average>=50) {
			grade=("C");
		}
		else if (average <50) {
			grade=("F");
		}else { 
			grade=("None");
	}
	}
}
