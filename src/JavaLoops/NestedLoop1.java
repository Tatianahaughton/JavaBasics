package JavaLoops;

public class NestedLoop1 {

	public static void main(String[] args) {
		// Car odometer/ 3 rows and 9 columns
		for (int a = 0; a <= 9; a++) {
			for (int b = 0; b <= 9; b++) {
				for (int c = 0; c <= 9; c++) {
					System.out.println(a + " " + b + " " + c); // initializing variables at 0 for each a b c; c starts
																// first, then b(c resetiing)
				}
			}
		}
		System.out.println("--------------------------------------");
		// multiplication table

		for (int i = 1; i <= 9; i++) {

			for (int j = 1; j <= 9; j++) {//this loop keeps going while still on 1st outer loop
				System.out.println(i + " * " + j + " = " + i * j);

			}
			System.out.println("--------------------------------------");
		}
		System.out.println("------------------------------------------------");

		// multiplication table of 3 only

		int num = 3;
		for (int a = 1; a <= 10; a++) {
			System.out.println(num + "*" + a + "=" + num * a);
		}

		System.out.println("---------------------------");
		//Print a pattern

		for (int i = 1; i <= 10; i++) {
			System.out.print(i + " ");
		}
		System.out.println(" ");

		for (int a = 2; a <= 20; a += 2) {
			System.out.print(a + " ");
		}
		System.out.println(" ");

		for (int b = 3; b <= 30; b += 3) {
			System.out.print(b + " ");
		}
		System.out.println(" ");

		for (int c = 4; c <= 40; c += 4) {
			System.out.print(c + " ");
		}
		System.out.println(" ");
		for (int d = 5; d <= 50; d += 5) {
			System.out.print(d + " ");
		}
	}

}
