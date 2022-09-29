package class4;

import java.util.Scanner;

public class InputFromKeyboard3 {

	public static void main(String[] args) {
		
		Scanner scanner=new Scanner(System.in);//import methods from Scanner class
		
		System.out.println("Please enter your age");
		
		int age=scanner.nextInt();//getting an int value from keyboard, use nextInt()
		
		if (age<18) 
		{System.out.println("You should study more");
		} else {
			System.out.println("You shuold start working");
		}
	}
}
