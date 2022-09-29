package class05;

import java.util.Scanner;

public class SwitchHw {

	public static void main(String[] args) {
		Scanner answer=new Scanner(System.in);
		System.out.println("Where are you from?");
		
		String country=answer.nextLine();
		String language;
		
		switch (country) {
		case"Russia":
			language="Russian";
			break;
		case"Japan":
			language="Japanese";
			break;
		case"Australia":
			language="Australian";
			break;
		case"Ukraine":
			language="Ukrainian";
			break;
		case"China":
			language="Chinese";
			break;
		case"France":
			language="French";
			break;
			default:
				language="Unknown";
				break;
		}
		System.out.println("You're from " +country+ " and your language is " +language);
	}	
		}
		
		
	


