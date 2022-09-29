package class3;

public class IfElse6 {

	public static void main(String[] args) {
		//Checking for specific condition using != NOT equal to
		int number=19;
		if(number!=18) {
			System.out.println("this number is not 18");
			
			int day=10;
			if(day==1) {
				System.out.println("Monday");
			}else if (day==2){
				System.out.println("tuesday)");
			}else if(day==3) {
				System.out.println("Wednesday");
			}else if(day==4) {
				System.out.println("Thursday");
			}else if (day==5) {
				System.out.println("Friday"); 
			}else if(day==6) {
				System.out.println("Saturday");
			}else if (day==7) {
				System.out.println("Sunday");
			}else {
				System.out.println("Enter a valid number");	
				}
		}
	}
}

