package com.syntax.class05;

import java.util.Scanner;

public class logicalOr {

	public static void main(String[] args) {
		Scanner answer=new Scanner(System.in);
		 System.out.println("Enter a number");
		 
		 int number=answer.nextInt();
		 
		 if (number>0&&number<=10){
			 System.out.println("small");

		 }else if(number>10&&number<=100) {
			 System.out.println("medium ");
			 
		 }else if (number>=101&&number<1000) {
			 System.out.println("Large");
		 }
		 }
	}

