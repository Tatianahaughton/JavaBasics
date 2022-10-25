package com.syntax.class4;

public class TypeCasting {

	public static void main(String[] args) {
	//Explicit type casting
		//short into byte
		short largerBox=129;//youll get a wrong answer bc its out of range
		byte smallerBox=(byte)largerBox;
		System.out.println(smallerBox);
		//int into short
		int largerBox1=129;
	short smallerBox2=(short)largerBox1;
		System.out.println(smallerBox2);
	
	
//Implicit 

	short smallerbox3=45;
	long largerBox3=smallerbox3;
	
	System.out.println(largerBox3);
}
}