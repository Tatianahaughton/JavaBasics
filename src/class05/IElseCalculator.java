package class05;

import java.util.Scanner;

public class IElseCalculator {

	public static void main(String[] args) {
		Scanner answer=new Scanner(System.in);
		
		System.out.println("Please enter 2 numbers");
		
		int num1=answer.nextInt();
		int num2=answer.nextInt();
		
		System.out.println("Enter operators");
		
		char operator=answer.next().charAt(0);
		
		//Using If statement
		
		double plus=num1+num2;
		double minus=(num1-num2);
		double mul=(num1*num2);
		double div=(num1/num2);
		
		if ((operator=='+')) {
	System.out.println(plus);
		}else if((operator=='-')) {
		System.out.println(minus);
	}else if ((operator=='*')) {
		System.out.println(mul);
	}else if ((operator=='/')) {
		System.out.println(div);
	}else {
			System.out.println("Please enter a valid operator");
		}
	}
}
