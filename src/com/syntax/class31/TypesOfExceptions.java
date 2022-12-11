package com.syntax.class31;

import util.ExcelReader;

import java.io.IOException;

public class TypesOfExceptions {
        String name=null;
        public static void main(String[] args)  {
     /*   String name=null;
        if(name!=null){
            System.out.println(name.length());
        }
@@ -22,11 +22,18 @@ public static void main(String[] args) {
        if(index<arr.length){
            System.out.println(arr[index]);
        }
*/

            try {
                System.out.println(ExcelReader.read("/Users/apple/IdeaProjects/SDETBatch14Java/Data/Test.xlsx"));
            } catch (IOException e) {
                System.out.println("Josh can you please stop deleting my files");
            }catch (NullPointerException e){

            }

            System.out.println("important line of code");

        }
    }

