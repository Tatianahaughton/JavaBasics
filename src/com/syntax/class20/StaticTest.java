package com.syntax.class20;

public class StaticTest {
    public static void main(String[] args) {
        StaticMethod obj=new StaticMethod();
        StaticMethod.printMessage();//static needs to be accessed with Class name
        obj.printMessage("Hello",3);//non-static needs to be accessed with object name
        StaticMethod.printMessage(4,5);
    }

}

