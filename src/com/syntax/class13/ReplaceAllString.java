package com.syntax.class13;

public class ReplaceAllString {
    public static void main(String[] args) {

        String strr="fkjlgfkldghfdklghdfl123&^%$";

        System.out.println(strr.replaceAll("[0-9]","@"));//removes nums from 0-9.
        System.out.println(strr.replaceAll("[0-9]",""));
        System.out.println(strr.replaceAll("[a-z]",""));//replaces letteres//if [0-Z]-will replace all chars in ASCi table up to Z.
        System.out.println(strr.replaceAll("[^A-Z]","")); //removes chars from Aschi table
        System.out.println(strr.replaceAll("[a^-zA-Z]",""));
        System.out.println(strr.replaceAll("[^a-zA-Z0-9]",""));

        System.out.println("-------------------------------");

        String sentence="Today is September";
         sentence=sentence.replace("September","October");//assign the new version to the variable in order to use the new var.
        System.out.println(sentence);

        sentence=sentence.replace('T','t');//reassign the variable again to get the new version
        System.out.println(sentence);//"today is September"

        sentence=sentence.replace('A','W');//these letters don't exist in this string/nothing will change
        System.out.println(sentence);

        //sentence.equalsIgnoreCase("Today is october").replace('a','i');//can't use replace function here bc it's a boolean condition.
                    //Method ignoreCase returns a boolean value not chars or strings


    }

}
