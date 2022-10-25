package com.syntax.class03;

public class Recap {

	public static void main(String[] args) {
		//String with any primitive data types concatenation example
		
		String firstName="Tatiana";
		String lastName="Haughton";
		String fullName=(firstName+ " " +lastName); // use "space" 
		
		System.out.println(fullName);
		
		// Combining two different data types int and String using varibles
		
		int houseNo=10;
		int apartmentNo=5;
		
		String streetName="That street";
		String city="New York";
		String country="USA";
		String fullAddress=apartmentNo+" "+houseNo+" "+streetName+" "+city+" "+country; //add" " between each
		
		//concatenating int and String using Strings and varibles 
		
		String incompleteAddress=houseNo+city;
		
		System.out.println(incompleteAddress);
		
		String step1="If we subtract 10 from 5 we get =" +10; //will print out a string with 10
		System.out.println(step1);
		//String step2=step1-5;-wont work subtracting String from int
		System.out.println("If we subtract 10 from 5 we get ="+(10-5));// will print String and math operation

	}

}
