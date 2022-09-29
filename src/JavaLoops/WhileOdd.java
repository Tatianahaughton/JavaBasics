package JavaLoops;

public class WhileOdd {

	public static void main(String[] args) {
		// Print odd numbers between 20-50
		
		for (int i=20; i<=50; i++)
		if (i%2==1){
			System.out.print(i+ " ");
		}
		
		System.out.println("--------------------------------");
		//Another way 
		
		int num=21;
		while(num<=50)
		{
			System.out.print(num+ " ");
			num+=2;
		}
		
		}
   
		}


