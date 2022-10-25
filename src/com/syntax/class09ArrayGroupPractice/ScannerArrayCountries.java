package com.syntax.class09ArrayGroupPractice;

import java.util.Scanner;

public class ScannerArrayCountries {

	public static void main(String[] args) {
		// String array
		
		Scanner answer=new Scanner (System.in);
		
		System.out.println("How many countries do you want to visit?");
		int length=answer.nextInt();
		
		 String[] country=new String[length];
		 String[] capital=new String[length];
		
		for(int i=0;i<country.length;i++) {
			System.out.println("Please enter your country");
			country[i]=answer.next();
			System.out.println("Enter the capital");
			capital[i]=answer.next();
		}
			for(int i=0;i<country.length;i++)
			System.out.println(capital[i]+ " is the capital of " +country[i]);
		
			}
		}

	

