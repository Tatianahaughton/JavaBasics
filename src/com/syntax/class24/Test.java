package com.syntax.class24;

public class Test {
    public static void main(String[] args) {
        Dog tommy=new Dog("Tom","German",1500,20);
        //Dog tommy = new Dog("Tommy", "German", 10, 20);

       /*tommy.name="Tommy";
        tommy.breed="German";
        tommy.age=15;
        tommy.weight=20;*/
        // System.out.println(tommy.name);
        System.out.println(tommy.getName());
        tommy.printInfo();
    }
}

