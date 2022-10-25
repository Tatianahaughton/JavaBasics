package com.syntax.class07;

public class LoopBreak {

	public static void main(String[] args) {
		// Break goes in If condition
		for (int i=1; i<5; i++) {
			System.out.println("Hello");
			if (i==3) {
			break;//exits block of code
			}
		}
		System.out.println("End");
		
		boolean hungry=true;
		while(hungry) {
			System.out.println("Give me food");
			break;
		}
	}

}
