package ScannerHomework;

import java.util.Scanner;

public class GetDiploma {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in); 
		
		System.out.println("Do you have a diploma? Enter true or false");
	
		boolean gotDiploma=scanner.nextBoolean();
				
		if(gotDiploma) {
		System.out.println("Congratualtions!");
		} else {
			System.out.println("You should get a degree");	
		}
		System.out.println("What's your gpa?");
		double gpaScore=scanner.nextDouble();
		
		if(gpaScore>=3.5) { 
		 System.out.println("You are eloigable for scholarship");
		}else {
			System.out.println("You should have studied harder");
		}
	 
	}
	
	  
	  
	

}		
			
					
			