package com.syntax.class27;

import java.util.HashMap;

public class MapDemo {
    public static void main(String[] args) {
//Map is interface where methods are defined, Hashmap implements those methods?

        HashMap<String,String> data=new HashMap<>();
        data.put("UserName","Anton123");//storing information inside a map. UserName is the key; Anton123 is the value
        data.put("Password","pass123");//store what the info represents
        System.out.println(data);
        System.out.println(data.get("Password"));//How to retrieve value

    }
}
