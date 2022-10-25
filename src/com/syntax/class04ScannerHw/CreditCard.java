package com.syntax.class04ScannerHw;

import java.util.Scanner;

public class CreditCard {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Do you have a credit card? True or False");
	
		boolean input=scanner.nextBoolean();

		
	if(input) {
	System.out.println("What is the balance on the credit card?");
	}else{
		System.out.println("We can offer you a credit card");
		}
	
	double balance=scanner.nextDouble();
	
	if(balance>1000){
		 System.out.println("Pay it off immidiately");
	}else{
		System.out.println("You can spend more");
		}	
	}
}




