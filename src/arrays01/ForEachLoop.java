package arrays01;

public class ForEachLoop {

	public static void main(String[] args) {
		// Enhanced loop
		
		String[] iceCream= {"vanilla", "mint","chocolate"};
		
		//Declare a new variable to put the elements in from the array
		for(String flavor:iceCream) {
			System.out.println(flavor);
		}
		
		System.out.println("-----------------------------");
		
		//printing all letters
		char[] letters= {'A','B','C','D'};
		for (char grades:letters) {
			System.out.println(grades+ " ");
		}
		
		System.out.println("-------------------------------");
		
		//Printing all numbers using 2 diff loops
		int[] numbers= {1,3,5,7,9};
		
		for (int i=0; i<numbers.length; i++) {
			System.out.println(numbers[i]+ " ");
		}
		
		//using enhanced loop. Grabs each elements to print
		//always loops one way from start to end
		for(int nums:numbers) {
			System.out.println(nums+ " ");
		}
	}

}
