package com.syntax.class30;
import java.util.HashMap;
import java.util.Map;

public class InterviewQ1 {
    public static void main(String[] args) {
        String str = "Hello Everybody";
        System.out.println(getCount(str));
    }
    public static Map<Character, Integer> getCount(String str) {
        char[] charArr = str.toCharArray();//converting string to an array of characters
        Map<Character, Integer> map = new HashMap<>();//crating map size 0 that will store cahracters and numbers
        for (char c : charArr) {
            if (map.get(c) == null) {//if nothing is assigned to a c yet
                map.put(c, 1);
            }else{
                int count=map.get(c);//getMethod returns value int
                count=count+1;
                map.put(c,count);

            }
        }
        return map;
    }
}





