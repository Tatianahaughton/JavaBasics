package com.syntax.class07;

public class ContinueLoop {

	public static void main(String[] args) {
		//
        // I want to print numbers from 1 to 20 except number 3, 7 and 11

        for (int i=1; i<=20; i++) {

            if(i==3|| i==7 || i==11) {
                continue;//skips these numbers
            }

            System.out.print(i+" ");
        }

        //continue - continues to the next iteration/cycle
        // moment Java sees continue -> it goes back to the beginning of the loop
        //it usually used inside some type of conditions

    }
}