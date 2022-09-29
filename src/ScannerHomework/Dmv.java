package ScannerHomework;

import java.util.Scanner;

public class Dmv {

	public static void main(String[] args) {
		
	Scanner scanner=new Scanner(System.in);
	
	System.out.println("How old are you?");
	int age=scanner.nextInt();

	if(age>18) {
		System.out.println("You can get a driver's license");
	} 
	else {
		
		System.out.println("You can only get a permit");
	}
}	
}
