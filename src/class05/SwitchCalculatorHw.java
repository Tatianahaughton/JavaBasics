package class05;

import java.util.Scanner;

public class SwitchCalculatorHw {

	public static void main(String[] args) {
		
		Scanner answer=new Scanner(System.in);
		
System.out.println("Please enter 2 numbers");
		
		int num1=answer.nextInt();
		int num2=answer.nextInt();
		
		System.out.println("Enter operators");
		
		char operator=answer.next().charAt(0);
		
		
		double plus=(num1+num2);
		double minus=(num1-num2);
		double mul=(num1*num2);
		double div=(num1/num2);
		
		double result;
	
		switch(operator) {
		case'+':
			result=(plus);
			break;
		case'-':
			result=(minus);
			break;
		case'*':
			result=(mul);
			break;
		case'/':
			result=(div);
			break;
			default:
				result=0;
				break;
		}
		System.out.println(result);
	}

}
	


