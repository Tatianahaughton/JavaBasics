package com.syntax.class10;

public class ArrayForEachLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] countries = {

                { "Usa", "Canada" }, // 1st array with index 0
                { "Peru", "Brazil", "Colombia", "Ecuador" }, // 2 array with index 1
                { "Ethiopia", "Egypt", "Kenya" }, { "Germany", "Turkiye", "Moldova", "Ukraine" },
                { "Kazakhstan", "Afghanistan", "Korea" } };

        System.out.println(" ------- getting all values from 2d array using for each loop -----");

        for (String[] country : countries) {//takes 2d array and creates a 1d array with a new var

            for (String c : country) {//takes single array and gets values using new var C

                if (c.equals("Kazakhstan")) {
                    System.out.println(c+ " is my home country");
                } else {
                    System.out.print(c + "  ");
                }
            }
            System.out.println();
        }
	}
}