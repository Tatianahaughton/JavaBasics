package com.syntax.class09ArrayGroupPractice;

public class Array2DOddVsEven {

	public static void main(String[] args) {
		// Store odd and Even numbers in an array

		int[][] number = new int[][]{{1, 3, 5, 7, 9,},
				{2, 4, 6, 8, 10}
		};


		for (int i = 0; i < number.length; i++) {
			for (int j = 0; j < number[i].length; j++) {
				if (number[i][j] % 2 == 0) {
				}

				System.out.println(number[i][j]);
			}
		}
		System.out.println("--------------------");
		//Print sum of even nums at even indexes

		{
			int[][] a = {
					{-5, -2, -3, 7},
					{1, -5, -2, 2},
					{1, -2, 3, -4}
			};

			int sum = 0;
			for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a[i].length; j++)
					if (i % 2 == 0 && j % 2 == 0) {
						sum += (a[i][j]);
					}
			}
			System.out.println(sum);


		}

	}
}
	


