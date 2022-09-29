package JavaLoops;

public class LoopTaskEven {
//Decrement from 100-1
	public static void main(String[] args) {
		
	int num=100;
	
    while(num>=1) {
		System.out.println(num);
		num--;
	}
    
    System.out.println("-------------------");
    
    int num2=20;
    
    while (num2<=100) {
    	if (num2%2==0) {
    		System.out.println(num2);
    	}
    	num--;
    }
	
	}

}
