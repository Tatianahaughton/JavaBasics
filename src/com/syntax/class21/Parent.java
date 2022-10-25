package com.syntax.class21;

public class Parent {

void getMarry() {
    System.out.println("Yay, I'm getting married");
}
}

class Child extends Parent {
    @Override
    void getMarry() {
        System.out.println("I don't want to get married");
    }
}

class Test {
    public static void main(String[] args) {
        Child obj=new Child();
        obj.getMarry();//using overriden method
    }
}
