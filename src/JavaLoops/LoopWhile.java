package JavaLoops;

import java.util.Scanner;

public class LoopWhile {

	public static void main(String[] args) {
//keep asking user to give exact amt for coffee until condition met
		Scanner answer = new Scanner(System.in);

		double price = 2.30;
		double payment;//price from user/ declare without initializing for value

		System.out.println("Please pay for your coffee");//can also keep inside the do loop 
		do {
			payment = answer.nextDouble();

			if (payment > price) {
				System.out.println("You owe less");
			} else if (payment < price) {
				System.out.println("You owe more");
			}
		} while (payment != price);
		System.out.println("Enjoy your coffee");
	}
}
