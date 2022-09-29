package com.syntax.class02;

public class OperatorsHomework {

	public static void main(String[] args) {
		//+/-/*/
		double num1=2.36;
		double num2=4.27;
		
		double sum=num1+num2;
		double sub= num1-num2;
		double mul=num1*num2;
		double div=num1/num2;
		
		System.out.println("The sum of 2 numbers " +num1+ " and " +num2+ " is equal to " +sum);
		System.out.println("The subtraction of 2 numbers " +num1+ " and " +num2+ " is equal to " +sub);
		System.out.println("The multiplication of 2 numbers " +num1+ " and " +num2+ " is equal to " +mul);
		System.out.println("The division of 2 numbers " +num1+ " and " +num2+ " is equal to " +div);
		System.out.println("-------------------------------------------------------------------");
		
		//Finding sqrt 
		
		double num=3.9;
		double sqrt=num*num;
		
		System.out.println("The square root of 3.9 is " +sqrt);
		System.out.println("-------------------------------------------------------------------");
		//Finding perimeter and area
		
		int height=5;
		int width=8;
		
		int perimeter=2*(height+width);
		int area=height*width;
		
		System.out.println("The perimeter of a rectangle with width " +width+ " and height " +height+ " is equal to " +perimeter+ " and the are is " +area);
		System.out.println("-------------------------------------------------------------------");
	}


}
