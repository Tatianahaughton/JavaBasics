package Arrays2D;

public class EnhancedArray {

	public static void main(String[] args) {
		// 
		
		String [][] names= {
				{"Tatiana", "Sasha","Lena", "Tanya"},
				{"A","B","C","D"}
		};
		for(String[] singleArray:names) {//loops over 1d array
			for(String el:singleArray) {//names are stored inside el. Loops over each element
				
				System.out.print(el+" ");
			}
			System.out.println();
		
System.out.println("------------------------------");

        for(int i=0; i<names.length; i++) {

            for (int j=0; j<names[i].length; j++) {
                System.out.print(names[i][j]+"  ");
            }
        
            System.out.println();
        }
		}
}
}


