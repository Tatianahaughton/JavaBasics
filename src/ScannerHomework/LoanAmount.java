package ScannerHomework;

import java.util.Scanner;

public class LoanAmount {

	public static void main(String[] args) {

		Scanner scan= new Scanner (System.in);
		
		System.out.println("What is the amount of loan that you need?");
		

		double loan=scan.nextDouble();
		if(loan<=200000) {
			System.out.println("We will loan you the money");
	}else {
		System.out.println("Your applicaion is rejected");
		}
	}	
}
		
	


