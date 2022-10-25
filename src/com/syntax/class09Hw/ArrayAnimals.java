package com.syntax.class09Hw;

public class ArrayAnimals {

	public static void main(String[] args) {
		//
		
		String[] animals={"Lion","Elephant","Bear","Tiger","Monkey"};
	
		for(int i=0; i<animals.length; i++ ) {
		System.out.print(animals[i]+" ");
		}
		
		System.out.println();
		System.out.println();
		
		String[] animalName={"Lion","Elephant","Bear","Tiger","Monkey"};
		
		for(String animal:animalName) {
			System.out.println(animal+" ");
		}
	}

}
