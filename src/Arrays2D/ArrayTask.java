package Arrays2D;

public class ArrayTask {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String[][] people=new String[4][4];
	people[0][0]="Mr";
	people[0][1]="Mrs";
	people[0][2]="Ms";
	people[0][3]="Miss";
	
	people[1][0]="Obama";
	people[1][1]="Smith";
	people[1][2]="Jackson";
	people[1][3]="Jordan";
	
	System.out.println(people[0][0]+ " "+people[1][0]+" "+people[0][1]+" "+people[1][1]+" "+people[0][2]+" "+people[1][2]+" "+people[0][3]+" "+people[1][3]);
	
	System.out.println("------------------------------------------");
	
	//short way to print a 2D array
	
	String [][] names= {
			{"Tatiana", "Sasha","Lena", "Tanya"},
			{"A","B","C","D"}
	};
	
	System.out.println(names[0][0]+"="+names[1][0]);
	System.out.println(names[0][1]+"="+names[1][1]);
	System.out.println(names[0][2]+"="+names[1][2]);
	System.out.println(names[0][3]+"="+names[1][3]);
	
	System.out.println("------------------------");
	

	
	
	System.out.println("-----------------------------------");
	
	//Storing values into 2D array
	
	String[][] country= {
			{"USA","Canada"},//2 elements in 1st array(USA[0]Canada[1]
			{"Peru","Brazil","Equador","Columbia"},//2nd array w index 1
			{"Ghana","Egypt","Kenya","Ethiopia"},//3rd array
			{"Germany","Turkiey","Moldova","Ukraine"},//4th array
			{"Japan","China","Korea"},//5th array
	
	};
	//System.out.println(country.length);-will only print the amt of single arrays you have inside
	
	int elOf1arr=country[0].length;
	System.out.println("Number of elements in 1st array = "+elOf1arr);
	
	int elOf2arr=country[1].length;
	System.out.println("# of elements here is "+elOf2arr);
	
	System.out.println("-------------------------");
	
	//using a loop 
	
	for (int r=0; r<country.length;r++) {//loops over rows
		for(int c=0; c<country[r].length;c++) {
			System.out.print(country[r][c]+" ");//use print if you want them side by side
		}
		System.out.println();//a way to print side by side and under each row use both print ways thats included
	}
	
	System.out.println("----------------------");
	
	}
	}
	
	

