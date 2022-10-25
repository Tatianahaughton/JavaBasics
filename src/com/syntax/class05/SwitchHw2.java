package com.syntax.class05;

import java.util.Scanner;

public class SwitchHw2 {

	public static void main(String[] args) {
		Scanner answer = new Scanner(System.in);
		System.out.println("Enter your grade");

		char grade = answer.next().charAt(0);
		String	sentence;
		
		switch(grade) {
		case'A':
			sentence="Excellent";
			break;
		case'B':
			sentence="Good";
			break;
		case'C':
			sentence="Average";
			break;
		case'D':
			sentence="Bad";
			break;
			default:
				sentence="Not acceptable";
				break;
		}
		System.out.println("You entered grade " +grade+ " which is " +sentence);
	}

}
