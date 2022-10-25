package com.syntax.class09ArrayGroupPractice;

public class Array2Dsum {

	public static void main(String[] args) {
		// Add sum of all nums in 2 d array

		int[][] numbers = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				sum += (numbers[i][j]);
			}
		}
		System.out.println(sum);

		System.out.println("----------Enhanced loop---------------");

		int[][] arr = new int[][] { { 1, 2, 3, 4, 5 }, { 6, 7, 8, 9, 10 } };

		sum = 0;

		for (int[] ar : arr) {
			for (int num : ar) {// takes individual elements from array
				sum += num;

			}
		}

		System.out.println(sum);
	}
}
