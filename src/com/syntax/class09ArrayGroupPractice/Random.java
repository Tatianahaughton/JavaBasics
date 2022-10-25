package com.syntax.class09ArrayGroupPractice;

import java.util.Arrays;

public class Random {

	public static void main(String[] args) {
		//
	
        // creates an array store elements in the array 
        // then with help of another array adds all the elements.
      
        int [] theArray=new int[10];//array with 10 elements
        int num=22;//number we can use to start with in our for loop
        
        for(int i=0;i<theArray.length;i++) {//going through index
        	theArray[i]=num;//assigning i to 11 and from the starting index0 as 11 being 1st num we decrement.
            num--;//decrement from 11
        }

        System.out.println(Arrays.toString(theArray));
        
        System.out.println("***********************");
        int sum=0;
        for(int nums:theArray) {
            //sum+=num;
            sum=sum+nums;
        }
        System.out.println(sum);

    }
}