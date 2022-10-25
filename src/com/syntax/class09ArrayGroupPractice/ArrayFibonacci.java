package com.syntax.class09ArrayGroupPractice;

import java.util.Arrays;

public class ArrayFibonacci {

	public static void main(String[] args) {
		//Fibonacci series
		
		int[]fArray = new int[8];
		fArray[1]=1;
		fArray[0]=0;
		
		for(int i=2;i<fArray.length; i++) {
			fArray[i]=fArray[i-1]+fArray[i-2];//num i= sum of 2 previous i's
		}
		
		System.out.println(Arrays.toString(fArray));
	}
		
}

