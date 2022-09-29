package JavaLoops;

import java.util.Scanner;

public class ContinueTask2 {

	public static void main(String[] args) {
		// 
	Scanner answer=new Scanner(System.in);
	System.out.println("What do you want");
	String name=answer.nextLine();
	
	System.out.println("How much is the item?");
	double price=answer.nextDouble();
	
	double money;
	double total=0;
	
	do {
		System.out.println("How much do you have");
	    money=answer.nextDouble();
	    
	    total+=money;//accumulate
	    double need;
	    double change;
	    
	    if (total<price) {
	    	need=price-total;
	    	System.out.println("You need to pay $ " +need);
	    }else if (total>price) {
	    	change=total-price;
	    	System.out.println("Here is your change " +change);
	    	break;
	    }
	}while (total !=price); 
	    	System.out.println("Thank you for shopping");
	}
	 }
	

