package class3;

public class Casting {

	public static void main(String[] args) {
		
		byte box1=127;//smallest box a byte can fit into
		short box2=3333;//smallest box a short can fit into
		int box3=45454545;//32 bits
		long box4=45454545;// 64 bits 
		float box5=4545454;//larger box
		double box6=45654546; //largest 
		
		//float into int 
		int number=(int)15.2;//float into int 
		System.out.println(number);
		
		//Short to byte
		byte smallerBox=(byte)box2;
		System.out.println(smallerBox);// goes by bits 5 is 8bits 
		
		//Byte to short
		short biggerBox=box1; //byte into short 
		//Short to Long
		long box7=box1;// converting box1 to long and naming a new variable box7 
		
		//float box8=box6; cant convert this way but can use () to type cast anyways
		float box8=(float)box6;// double to float by forcing with ()
		
		char a=(char)66;//converting number into letter 
		System.out.println(a);
	}

}
