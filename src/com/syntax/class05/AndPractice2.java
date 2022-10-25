package com.syntax.class05;

import java.util.Scanner;

public class AndPractice2 {

	public static void main(String[] args) {
		
		Scanner answer=new Scanner(System.in);
		
		int day=7;
		System.out.println("What number of day?");
		
		int dayAnswer=answer.nextInt();
		
		if (dayAnswer>=1 && dayAnswer<=5) {
			System.out.println("Weekday");
		}else if (dayAnswer==6 || dayAnswer==7) {
			System.out.println("weekend");
		}else {
			System.out.println("invalid");
		}
	}
}
