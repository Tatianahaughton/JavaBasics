package com.syntax.class25;

import java.util.ArrayList;

public class RemoveWords {
    public static void main(String[] args) {
        ArrayList<String> word=new ArrayList();
        word.add("hi");
        word.add("hi");
        word.add("yo");
        word.add("sup");
        word.add("yolo");
        word.add("boop");

        ArrayList<String> words=new ArrayList();
        words.add("hi");
        words.add("sup");
        words.add("boop");


        word.removeAll(words);

        for(String word2:word) {
            System.out.print(word2+" ");
        }
    }
}
