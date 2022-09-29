package arrays01;

public class Arrays {

	public static void main(String[] args) {
		// Storing elements inside arrays 
		
		int[] arr=new int[4];
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		
		//Accessing elements from array
		
		System.out.println(arr[2]);
		
		System.out.println(arr[1]+arr[2]);
		
		System.out.println("----------------------------------");
		
		int[] nums=new int[3];
		
		nums[1]=12;
		nums[2]=13;
		
		System.out.println(nums[0]);
		
		System.out.println();
		
		String[] colors=new String[3];//array size 3
		colors[0]="White";
		colors[1]="Pink";
		colors[2]="Black";
		//colors[3]="Yellow";//Array is out of bound
		
		System.out.println(colors[2]);
		
		System.out.println("-------------------------------------");
		
		//String array
		
		String[] drinks= {"fanta", "milk", "coke"};
		System.out.println(drinks[2]);
		
		//finding size of this array
		
		int size=drinks.length;
		System.out.println("size of array=" +size);
		
		
	}

}
