package JavaLoops;

import java.util.Scanner;

public class MyLoopPractice {

	public static void main(String[] args) {
		//
		Scanner answer=new Scanner(System.in);
		
		System.out.println("Have you had any water today? Yes or no?");
		
		boolean hadWater=answer.nextBoolean();
		
		
		if(hadWater) {
			System.out.println("You shuold probably drink more");
		
		}else {
			System.out.println("You need to drink more now");
		}
		
		System.out.println("-----------------------------------");
		
		int number=1234;
		int guess;
		do {
			System.out.println("Guess my number");
			 guess=answer.nextInt();
		}while(!(guess==number));// or (guess!=number)
			
		System.out.println("Finally!");
		}
			
		}




	


;
