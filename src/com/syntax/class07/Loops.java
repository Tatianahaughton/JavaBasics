package com.syntax.class07;

import java.util.Scanner;

public class Loops {

	public static void main(String[] args) {
		// Ask user a question and repeat it 3 times
		Scanner answer = new Scanner(System.in);//keep outside of loop

		int i = 1;//initialize starting point?
		for (i = 1; i <= 3; i++) {
			System.out.println("What is your name");//can be here or under Scanner.
			String name = answer.nextLine();

			System.out.println("Good afternoon " + name);
		}
		
		System.out.println("------------------------------------");
		
		  int a=7;
		   while(a<=98) {
		     System.out.println(a+ " ");
		     a+=7;//prints numbers by groups of 7 (7,14,21,28 etc 
		   }
	}

}
