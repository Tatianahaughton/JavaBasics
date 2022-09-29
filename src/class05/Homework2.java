package class05;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
	Scanner answer=new Scanner(System.in); 
	System.out.println("Enter your birth month");
	
	String month=answer.nextLine();
	
	String season;
	
	if(month=="March" || month=="April" || month=="May") {
		season="Spring";
		}
		else if (month=="June" || month=="July" || month=="August") {
		season="Summer";	
		}
		else if (month=="September" || month=="October" || month=="November") {
		season="Fall";	
		
	
	System.out.println("Your season is " +season);
	}
}
}

