package Arrays2D;

public class ArrayShortcutPrint {

	public static void main(String[] args) {
		// 
		
		String [][] names= {
				{"Tatiana", "Sasha","Lena", "Tanya"},
				{"A","B","C","D"}
		};
		
		for (int i=0; i<names.length; i++ ) {
			for(int j=0; j<names[i].length; j++) {//less than array of whatever row we're in 
				
				System.out.println(names[i][j]);//print by specifying array of rows(i) and columns(j)
			}
	}

	}
}