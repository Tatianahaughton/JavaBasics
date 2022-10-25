package com.syntax.class09ArrayGroupPractice;

public class ArraySumEvenOdd {

	public static void main(String[] args) {
		//

		int[][] numbers = { { 1, 2, 3, 4, }, { 5, 6, 7, 8 } };
		
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				if (numbers[i][j] % 2 == 0)
					sumEven = sumEven + numbers[i][j];
				else
					sumOdd = sumOdd + numbers[i][j];
			}
		}
		System.out.println("Sum of odd numbers is " + sumOdd);

		System.out.println("Sum of even numbers is " + sumEven);
	}
}
