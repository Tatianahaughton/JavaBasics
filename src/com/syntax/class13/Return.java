package com.syntax.class13;

public class Return {
    boolean mystery() {
        return true;
    }
    String mystery2(int num) {
        return"Java";
    }

    String method(String word) {
        //return"Java";
        if(word.equals("Java")) {
            return "python";
        }else {
            return"Java";
        }
    }

    public static void main(String[] args) {
        Return obj = new Return();
        System.out.println(obj.mystery());
        System.out.println(obj.mystery2(5));
        System.out.println(obj.method("python"));
    }

}
