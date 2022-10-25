package com.syntax.class4;

import java.util.Scanner; // rght click on Scanner to import

public class InputFromKeyboard {

	public static void main(String[] args) {
		//Printing by concatenating variable and string
		Scanner input= new Scanner(System.in);
		System.out.println("Please enter your name");
		
		String name=input.next();//takes input from keyboard 
		System.out.println("Hello " +name);
		
		
	}
}
