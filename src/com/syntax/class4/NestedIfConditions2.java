package com.syntax.class4;

public class NestedIfConditions2 {

	public static void main(String[] args) {
		
		double moneyInAccount=2000;
		String season="Spring";
		//IF 
		if (season.equals("Spring"))
			
			//AND IF
			if(moneyInAccount>30000) 
			{
	System.out.println("Lets go onvacay");//then execute this
		}
			else //execute this
		{
			System.out.println("I need to save more");
		}
	}

}
