package com.syntax.class4;

public class NestedConditions {

	public static void main(String[] args) {
		//Outer and inner if conditions
	int time=9;
	String day="Monday";
	//Executes nested condition if first condition is true
	
	if(day.equals("Monday")) {
		if (time>7) {
			System.out.println("Let's go to office");
			
			if(time<6) {
				System.out.println("Lets sleep more");
			}
		}
	}

	}

}
