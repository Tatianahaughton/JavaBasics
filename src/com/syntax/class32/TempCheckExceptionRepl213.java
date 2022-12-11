package com.syntax.class32;

public class TempCheckExceptionRepl213 {
    public void tempCheck(int temp) throws Exception {
        if(temp<32) {
            throw new Exception ("It is freezing");
        }
    }

    public static void main(String[]args) throws Exception {
       TempCheckExceptionRepl213 obj=new TempCheckExceptionRepl213();
       obj.tempCheck(30);
    }
}

