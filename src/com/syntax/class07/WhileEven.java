package com.syntax.class07;

public class WhileEven {

	public static void main(String[] args) {
		// Print even numbers from 20-1 using while loop

		int i = 20;

		while (i > 1)
			if (i % 2 == 0) {
				System.out.print(i+ " ");
				i -= 2;
			}

		System.out.println("----------------");

		int a = 20;
		while (a >= 1) {
			System.out.print(a+ " ");
			a -= 2;
		}
		
		System.out.println("------------Using For Loop-------------------");
		
		for (int b=20; b>=1; b-=2) {
			System.out.print(b+ " ");
		}
		System.out.println("-------------------another way");
		
		for (int c=20; c>=1; c--) {
			if (c%2==0) {
				System.out.print(c+ " ");
			}
		}
	}
}
