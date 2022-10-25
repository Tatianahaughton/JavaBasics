package com.syntax.class09ArrayGroupPractice;

import java.util.Scanner;

public class ScannerArraySum {

	public static void main(String[] args) {
		
		Scanner answer=new Scanner(System.in);
		int amountNums;
		
		System.out.println("How many numbers will you enter");
		amountNums=answer.nextInt();
		
		int[] elements=new int[amountNums];
		System.out.println("Enter all elements");
		
		for(int i=0; i<amountNums; i++) {
			elements[i]=answer.nextInt();
		}
		int sum=0;
		
			for(int num:elements) {
				sum=sum+num;
			}
	
		System.out.println("The sum is " +sum);
	}
		
}


