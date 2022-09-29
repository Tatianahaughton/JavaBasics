package class4;

public class IfElseDemo {
//String if else
	public static void main(String[] args) {
		String userName = "Admin";
		String password = "password123";

		if (password.equals("password123")) {
			System.out.println("Welcome " + userName);
		} else {
			System.out.println("Wrong password " + userName);
		}
		
		//if /else if/ else 
		int num=12;
		
		if(num>0) {
			System.out.println("number is positive");
		} else if (num<0) {
				System.out.println("number is negative");
			}
			else {
				System.out.println("number is positive");
			}
		
	}

}
