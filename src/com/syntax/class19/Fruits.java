package com.syntax.class19;

public class Fruits {
   String name;
   boolean isTropical;
   String color;
   public Fruits(String name, boolean isTropical,String color) {
      this.name = name;
      this.isTropical = isTropical;
      this.color=color;
   }
   public void printSentence() {
       if (isTropical == true) {
           System.out.println("My favorite fruit is " + name + " its color is " + color + " and it is a tropical fruit");
       } else {
           System.out.println("My favorite fruit is " + name + " its color is " + color + " and it is not a tropical fruit");
       }
   }

       static void printF() {
           System.out.println("We love eating different fruits!");
       }



      public static void main(String[] args) {
       Fruits fruits=new Fruits("Pineapple",true,"yellow");
      fruits.printSentence();
        YellowFruits banana= new YellowFruits("Banana",true,"yellow",true);
        banana.printSentence();
        RedFruits apple=new RedFruits("Apple",false,"red",false);
        apple.printSentence();
          }
      }


