package com.syntax.class13;

public class EmptyStringTask {
    public static void main(String[] args) {
        String string = "Good morning, everyone!";

        int middleIndex;
        if (!string.isEmpty()) {
                if (string.length() > 3 && (string.length() % 2 !=0)) {
                    middleIndex= (string.length()/2);
                    System.out.println(string.length());
                System.out.println(string.charAt(middleIndex));

            }
        }

        System.out.println("----------------------");


        String s1="hello";
        String s2="";

        System.out.println(s1.isEmpty());
        System.out.println(s2.isEmpty());

        System.out.println("--------------------------");

        String str="wow";

        boolean empty=str.isEmpty();
        System.out.println(empty);

        }

        }




