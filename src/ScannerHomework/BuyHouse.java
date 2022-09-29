package ScannerHomework;

import java.util.Scanner;

public class BuyHouse {

	public static void main(String[] args) {
		
		boolean buyHouse=true;
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("What is the mortgage rate");
		
		double rate=scanner.nextDouble();
		
		if (rate>4.5) {
			System.out.println("Sorry,we won't buy a house at this rate.");
		}else {
			System.out.println("we will consider.");
		
		System.out.println("What is the price of the house?");
		double mortgage=scanner.nextDouble();
	
		if (buyHouse && mortgage>200000){
			System.out.println("User will need a loan");
		} else {
			System.out.println("User will pay cash");
}
}
}
}