package com.syntax.class09Hw;

public class ArrayLargest {

	public static void main(String[] args) {
		// Find largest number
		
		int[]n={12,34,23,76,98};
		
		int largest=n[0];
		
		for(int i=0; i<n.length; i++) {
			if(largest<n[i]) {
				largest=n[i];
				}
		}
	
			System.out.println(largest);
		}
	}

		
		
	
		
		
		
		
		
		


