package com.syntax.class09;

public class ArrayTask {

	public static void main(String[] args) {
		// Create an array of chars to store grades in 2 ways
		
		char[] grade=new char[4];
		grade[0]='A';
		grade[1]='B';
		grade[2]='C';
		grade[3]='D';
		
		System.out.println(grade[1]);

		System.out.println("------------------");
		
		char[] grades={'A','B','C','D'};
		System.out.println(grades[1]);
		
		System.out.println("---------------------------------------");
		
		String[] names=new String[4];
		names[0]="Lena";
		names[1]="Tatiana";
		names[2]="Sasha";
		names[3]="Masha";
		
		System.out.println(names[1]);
		
		System.out.println("------------------------");
		
		String[] name={"Lena","Tatiana","Sasha","Masha"};
		System.out.println(name[1]);
		
		System.out.println("--------------------------------");
		
		String [] words= {"Java","Saturday","Day","coding","is"};
		System.out.print(words[1]+" " +words[4]+ " "+words[0]+ " " +words[3]+ " " +words[2]+".");
	
	
	}

}
