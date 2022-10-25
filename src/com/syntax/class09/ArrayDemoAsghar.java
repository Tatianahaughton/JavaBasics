package com.syntax.class09;

import java.util.Scanner;
import java.util.Arrays;

public class ArrayDemoAsghar {

	public static void main(String[] args) {
		// 
		
	Scanner answer=new Scanner(System.in);
	
	System.out.println("Enter a number of dresses to buy");
	
	int number=answer.nextInt();//num stored in number
	
	double[] prices= new double[number];// creating array of that size
	
	for(int i=0; i<number; i++) {
		System.out.println("Enter price " +i);
		prices[i]=answer.nextDouble();//updating value with each i/ cant use enhanced loop bc of no indexes.
	}
	System.out.println(Arrays.toString(prices));
	
	//Sum for given elements 
	double sum=0;
	for(double price:prices) {
		sum+=price;//sum=sum+price
	}
		System.out.println("Total for all dresses= " +sum);
	}
	}


