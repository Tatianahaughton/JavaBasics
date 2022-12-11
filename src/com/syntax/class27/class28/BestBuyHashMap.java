package com.syntax.class27.class28;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class BestBuyHashMap {
    public static void main(String[] args) {
        /*Create a map of Best Buy store. Place
        item id and item name into it. Example (7664847 = Printer, 7879885= TV etc )
        Retrieve all keys and values from a Best Buy map using EntrySet.*/

        HashMap<String,String> items=new HashMap<>();
        items.put("Iphone 14","123456");
        items.put("Iphone 13","78910");
        items.put("Iphone 12 ","456577");
        items.put("Iphone 11 ","654327");
        items.put("Iphone 10","342578");

       Set<Map.Entry<String,String>> phones=items.entrySet();
        for(var item:phones){
            System.out.println(item.getKey()+" "+item.getValue());
        }
        }
    }

