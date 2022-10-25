package com.syntax.class05;

public class NestedIf {

	public static void main(String[] args) {
		boolean allergy = true;
		String allergyType = "Peanut";
		
		if(allergy) {
			System.out.println("Lets check what allergy you have");
			if(allergyType.equals("Pollen")) {
				System.out.println("Stay indoor");
			}else if(allergyType.equals("Peanut")) {
				System.out.println("Stay away fromt them");
			}else if(allergyType.equals("Dairy")) {
				System.out.println("Stay away from dairy");
			}
			
		}else {
			System.out.println("You are lucky");
		}
	}

}
