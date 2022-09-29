package class4;

import java.util.Scanner;

public class InputFromKeyboard5 {

	public static void main(String[] args) {
		//taking boolean value from user as input
		
		Scanner scanner=new Scanner(System.in);
		System.out.println("Did you solve repl assignments, enter true or false");
		
		boolean solvedAnyRepls=scanner.nextBoolean();
		
		if(solvedAnyRepls) {
			System.out.println("How many?");
			
			int noOfReplsSolved=scanner.nextInt();
			
				if(noOfReplsSolved>=17)
				{
					System.out.println("you are doing great");
					
				}else if (noOfReplsSolved>10 ) {
					System.out.println("You are doing ok");
			}else {
				System.out.println("You need more practice");
			}
		}else {
				System.out.println("They are very important");
			}
			
		}
		
	}


