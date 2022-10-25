package com.syntax.class13;

public class PrintManyTimes {
    void printManyTimes(int times){
        for(int i=0; i<times; i++) {
            System.out.println("Hello Java");//print hello java i times
        }
    }

    void printCustomWordManyTimes(String word,int times) {
        for(int i=0; i<times; i++) {
            System.out.println(word);
        }
    }

    public static void main(String[] args) {
        PrintManyTimes object=new PrintManyTimes();

        object.printManyTimes(5);
        object.printCustomWordManyTimes("Syntax Easy",2);//importan sequence// has to be as defines in line 8
    }
}
