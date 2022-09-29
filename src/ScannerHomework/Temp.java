package ScannerHomework;

import java.util.Scanner;

public class Temp {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner (System.in);
	{
	System.out.println("What is your city?");
	}
	
	String city =scanner.nextLine();
	
	{
	System.out.println("What is the temperature");
	}
	
	double temp=scanner.nextDouble();
	double celsius=(temp-32)*5/9;	
	{
	System.out.println("The temperature in the "  +city+ " is " +celsius+ " Celsius");
}
	
}
	
}