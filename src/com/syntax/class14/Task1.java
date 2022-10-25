package com.syntax.class14;

public class Task1 {
    public static void main(String[] args) {

        //StringBuilder stringbuilder=new StringBuilder();
        //stringbuilder.reverse();
       // System.out.println(stringbuilder);


        String str="This is the sentence I want to reverse";
        String[] arr=str.split(" ");//created an array with individual words with their indexes
        StringBuilder st=new StringBuilder();
        for (int i=0; i<arr.length; i++){
        String word=arr[i];
        StringBuilder stringBuilder=new StringBuilder(word);//convert it into a stringbuilder just so we can use"reverse" method
        stringBuilder.reverse();//reversing
        arr[i]=stringBuilder.toString();//at arr[i]-theres only "this" or at arr[0]?. turning back into string
            st.append(arr[i]).append(" ");//reverse and attach it again
        }
        System.out.println(st);
    }
}
