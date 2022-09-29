package arrays01;

public class ArrayFor {

	public static void main(String[] args) {
		
		String[] iceCream= {"vanila", "chocolate"};
		for(int i=0; i<iceCream.length;i++) {
			System.out.println(iceCream[i]);
		}
		
		System.out.println("---------------------------------");
		
		char[] grades={'A','B','C','D'};
		for(int i=0; i<=grades.length;i++) {
			System.out.print(grades[i]+" ");//variable i controls the index in this moment
		}
	}

}
