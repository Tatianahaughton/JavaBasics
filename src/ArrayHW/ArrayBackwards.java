package ArrayHW;

public class ArrayBackwards {

	public static void main(String[] args) {
		//Print in reverse 
		
		char[] letters= {'A','B','C',};
		for(int i=letters.length-1;i>=0;i--) {// add -1 to make a reverse
			System.out.println(letters[i] + " ");
		}

	}

}
