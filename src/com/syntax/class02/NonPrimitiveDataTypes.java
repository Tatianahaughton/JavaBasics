package com.syntax.class02;

public class NonPrimitiveDataTypes {

	public static void main(String[] args) {
		// String data type
		String name="Tatiana";
		
		String address="123 address street";
		
		String phone="240 424 4456";
		
		//String age="17";  Use int for age.

		int age=17;
		
		//Ctrl+space-completes statement sysoutCTRL+SPACE
		
		//Concatinating Strings:
		
		System.out.println ("My name is "+  name); // add spaces between "" and words to create spacing.
		
		System.out.println(name  +" is "+  age);
		
		String fruit="apple";
		double price=1.99;
		
		System.out.println("The price of the " +fruit +  " is " +price);
		
		fruit="mango";
		price=5.99;
		
		System.out.println("The price of the " +fruit +  " is " +price);
	}

}
