package com.syntax.class05;

import java.util.Scanner;

public class AndPractice {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your height in inches");

		int answer = input.nextInt();

		if (answer < 60) {
			System.out.println("Short");
			
		} else if (answer >= 60 && answer< 72) {
			System.out.println("Medium");
			
		}else if (answer>72){
			System.out.println("Tall");
		}
	}
}
