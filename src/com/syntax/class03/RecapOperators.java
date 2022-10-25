package com.syntax.class03;

public class RecapOperators {

	public static void main(String[] args) {
		/*
		 * Addition=> + Sub=>- Mul=> * Div=> / Mod=> %
		 */
		int number1=9;//whole numbers
		int number2=2;
		System.out.println(number1/number2);
		System.out.println("Remainder =" + number1%number2);// hows remainder 1
		
		double number3=9;//decimals
		double number4=2;
		System.out.println(number3/number4);
		
		// double returns about 16 decimal spaces after decimal point
		double number5=1;
		double number6=3;
		System.out.println(number5/number6); //infinite answer
		
		//float returns 6 decimals spaces of accuracy after decimal point.
		float number7=1;// add f if you want a decimal return 
		float number8=3;
		System.out.println(number7/number8);
	}
	}


