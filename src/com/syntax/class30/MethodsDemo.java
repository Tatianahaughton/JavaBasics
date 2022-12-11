package com.syntax.class30;

import util.ExcelReader;

import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;

public class MethodsDemo {
        //public static Dog returnDog(){
           // return new Dog("Fuff","green","German");
        //}

        public static Map<String,String> getMap(){
            Map<String,String> map=new LinkedHashMap<>();
            map.put("Apple","Mango");

            return map;
        }

        public static void main(String[] args) throws IOException {
         //  Dog dog=returnDog();
          //  System.out.println(dog);

            System.out.println(getMap());

          var data= ExcelReader.read("C:\\Users\\Tatiana Haughton\\Desktop\\Syntax\\JavaBasics\\Data\\Test.xlsx");

            System.out.println(data.get(1));
       // LinkedHashMap<String,String> map=data.get(2);
      //     System.out.println(map.get("Age"));

        }
    }


