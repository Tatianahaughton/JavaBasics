package ScannerHomework;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner (System.in);
		
		System.out.println("How many years have you worked");
		
		int yearsWorked=scanner.nextInt();
		
		if (yearsWorked>=5) {
			System.out.println("You are eligable for bonus");
		
		System.out.println("What is your salary?");	
			
			double salary=scanner.nextDouble();
			
		if (salary>5000) {
			System.out.println("Your bonus is 5000");
		}else {
			System.out.println("Your bonus is 3000");
		}	
		}else{
			System.out.println("Sorry, you're not eligable");
		}
	}
}

