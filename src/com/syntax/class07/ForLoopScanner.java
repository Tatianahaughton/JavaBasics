package com.syntax.class07;

import java.util.Scanner;

public class ForLoopScanner {

	public static void main(String[] args) {
		//
		Scanner answer=new Scanner(System.in);
		
		System.out.println("enter a number");
		
		int x=answer.nextInt();
		
		for (int i=0; i<=x;) {
			for(int j=0; j<x+i; j++) {
				System.out.print(j+ " ");
			}
			break;
		}
		System.out.println(" ");
		
		//Write a for loop that will print out a series of numbers starting at 0 and ending at the doubled value. 

		System.out.println("------------------------------------------");
		
		  System.out.println("Enter a number");
		  int userInput=answer.nextInt();
		  
	    for(int i=5;i< userInput*2;){//chooses which number to start with but wont go over the doubled number of elements
	        for(int j=i; j<userInput*3; j++) {//doubles amount of numbers user put
	        System.out.print(j+ " ");
	      }
	        break;//to get out of printing over and over 
	    }
	}

}
