package com.syntax.class20;

public class PrivateMethod {

    private void printInformation() {
        System.out.println("This is a private message");

    }
        private void printInformation(int num) {
            System.out.println("This is a private message with an integer parameter:" + num);

        }
            private void printInformation (String str, char c) {
                System.out.println("This is a private message with string anc char parameter: "+str+", "+c);
            }

                            //Private method only be accessed inside this class
    public static void main(String[] args) {
        PrivateMethod obj=new PrivateMethod();
        obj.printInformation();
        obj.printInformation(2);
        obj.printInformation("Hi",'k');
    }
    }





