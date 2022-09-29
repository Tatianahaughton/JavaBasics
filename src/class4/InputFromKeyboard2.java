package class4;

import java.util.Scanner;

public class InputFromKeyboard2 {

	public static void main(String[] args) {
		//printing by using variable.
		//Always use {} between systemout?
		Scanner scanner=new Scanner(System.in);
		{
			System.out.println("Enter any sentence");
		}
		
		String sentence=scanner.nextLine();
		{
			System.out.println(sentence);
		}
		
	}
	}


