package JavaLoops;

public class ForLoop {

	public static void main(String[] args) {

        for (int i = 1; i <= 5; i++) {

            System.out.println("Hello");
        }

        System.out.println(" -------------------------- ");

        // print numbers from 1 to 20

        for (int i = 1; i <= 20; i++) {

            System.out.print(i + " ");
        }

        System.out.println(" -------------------------- ");
        // print numbers from 30 to 10

        for(int i=30; i>=10; i--) {

            System.out.print(i+" ");
        }
        System.out.println(" -------------------------- ");
        
        //0-10 even
        for(int i=0; i<=10; i+=2) {
            System.out.print(i+" ");
        }

        System.out.println(" -------------------------- ");
        
        //10-25 by 5's

        for(int i=10; i<=25; i+=5) {
            System.out.print(i+" ");
        }

        System.out.println(" -------------------------- ");
        //what is the output

        int sum=0;

        for(int i=1; i<=6; i++) {
            sum+=i;
        }

        System.out.println(sum);
        //print even 
        for (int x=2; x<=14; x++)
            if (x%2==0) {
              System.out.println(x+ " ");
        
            }
        
        System.out.println("--------------------------------------");
        //print odd 
        
        for(int a=5; a<22; a++)
            if(!(a%2==0)) {
            System.out.println(a+ " ");
        }
        
        System.out.println("------------------------------");
        //If and next line
        for(int a=2011; a<=2019;a++) {
            System.out.println("Hey,it is year: ");
            System.out.println(a);
          }
        
        System.out.println("--------------------------------");
        
        //Print count down and Happy New Years! at the end
        
        for (int i=10; i>=1; i--) {
            System.out.println(i);
          }
            System.out.println("Happy New Year!");
            
         
    }
}