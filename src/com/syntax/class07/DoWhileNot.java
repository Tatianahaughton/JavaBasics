package com.syntax.class07;

import java.util.Scanner;

public class DoWhileNot {

	public static void main(String[] args) {
		Scanner answer=new Scanner(System.in);
		String input;
		
		System.out.println("Did you get a job?");
		input=answer.nextLine();
		
		while(!input.equals("yes")) {
			System.out.println("Did you get a job?");
		}

	}

}
