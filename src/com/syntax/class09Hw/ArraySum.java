package com.syntax.class09Hw;

public class ArraySum {

	public static void main(String[] args) {
		// Calculate sum
		
		int[] nums= {10,20,30,40}; 
	
		System.out.println(nums[0]+nums[1]+nums[2]+nums[3]);
		
		
		System.out.println("-------------------------------------------");
		
		
		int sum=0;
		
		for(int i=0; i<nums.length; i++)
		sum+=nums[i];
	
		System.out.println(sum);
		
		System.out.println("---------------------------------");
		
		

	}

}
