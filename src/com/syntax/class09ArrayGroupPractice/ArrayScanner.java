package com.syntax.class09ArrayGroupPractice;

import java.util.Scanner;

public class ArrayScanner {

	public static void main(String[] args) {
		// Is a number prime?
		
		Scanner answer=new Scanner(System.in);
		
		System.out.println("Enter a number");
		
			double input = answer.nextDouble();
			boolean whole=false;
			
				for (int i=2; i<=input/2; i++)
				if (input%i==0) {
					whole=true;
					break;
				}
	if (!whole) {
		System.out.println("This is a prime number"); 
	}else {
		System.out.println("This isn't a prime number"); 
	}
	}
}
				
						
					

				
		
			
		
	



	

		
		
		
		
		
		
		


