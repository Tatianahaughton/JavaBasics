package class05;

public class LogicalNot {

	public static void main(String[] args) {
		// Logical Not ! always goes first in condition
		boolean boo = !true;// not true
		System.out.println("boo");

		boolean boo1 = !false;
		System.out.println("boo1"); // true

		boolean rain = false; // turinng variable to true and can execute the code
		if (!rain) {
			System.out.println("Go for a walk");
		}

		String day = "Sunday";

		if (!day.equals("Sunday")) {
			System.out.println("Today isnt Sunday");
		}

        boolean checkboxSelected=true;
        if(!checkboxSelected) {
		System.out.println("We,ll click");
	}
	System.out.println("End of program");
}
}
