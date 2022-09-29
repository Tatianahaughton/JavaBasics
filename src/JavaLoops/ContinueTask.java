package JavaLoops;

public class ContinueTask {

	public static void main(String[] args) {
		// Print nums from 1-50 except ones divisable by 3.
		for (int i=1; i<=50; i++) {
			if (i%3==0){
			continue;//skips those that are divisable by 3
			}
	
		System.out.print(i+ " ");
	}
	}
}
