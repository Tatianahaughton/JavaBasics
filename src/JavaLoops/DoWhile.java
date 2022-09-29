package JavaLoops;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		
        int secret = 1234;
        int guess;

        do {
            System.out.println("Please guess the secret number: ");
            guess = input.nextInt();

        }while(guess != secret);

        System.out.println("You won!");
        
        System.out.println("---------------------------------");
        
        //Using do while loop print numbers from 10 to 20/ Must not include the number 20 in the output. 

        int i=10;
        do {
          System.out.println(i+ " ");
          i++;
          }while (i<20);
        
        System.out.println("------------------------");
        
        //Create a do while loop that prints out "Hello World!" 5 times. 
        
        int a=1;
        
        do {
          System.out.println("Hello World!");
          a++;
        }while (a<=5);
        
        System.out.println("-------------------------");
        
        int b=20;
        do {
          System.out.println(b+ " ");
            b-=2;
        } while (b>1);
   
      
	}
}