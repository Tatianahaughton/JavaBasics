package com.syntax.class09Hw;

public class CarHw {

	public static void main(String[] args) {
		// Car hw 1st way
		
		String[] cars={"Toyota","Honda","Ford","BMW","Pontiac","Mitsubishi"};
		
		for (int i=0; i<cars.length; i++) {
		System.out.print(cars[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		String[] carName={"Toyota","Honda","Ford","BMW","Pontiac","Mitsubishi"};
		
		for (String name:carName) {
			System.out.print(name+ " ");
		}
	}
}

