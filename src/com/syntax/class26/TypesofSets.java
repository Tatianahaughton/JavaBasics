package com.syntax.class26;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class TypesofSets {
    public static void main(String[] args) {

        //fastest when inserting and retrieving data, when order isn't important
        HashSet<String> hashSet=new HashSet<>();
        hashSet.add("Mango");
        hashSet.add("Apple");
        hashSet.add("Kiwi");
        hashSet.add("Orange");
        hashSet.add("Banana");
        System.out.println("HashSet is unordered list:");
        System.out.println(hashSet);

                        //Retrieval speed is slow
        LinkedHashSet<String> linkedHashSet=new LinkedHashSet<>();
        linkedHashSet.add("Mango");
        linkedHashSet.add("Apple");
        linkedHashSet.add("Kiwi");
        linkedHashSet.add("Orange");
        linkedHashSet.add("Banana");
        System.out.println("linkedHashSet is ordered list:");
        System.out.println(linkedHashSet);


                        //TreeSEt sorts data alphabetically
        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("Mango");
        treeSet.add("Apple");
        treeSet.add("Kiwi");
        treeSet.add("Orange");
        treeSet.add("Banana");
        System.out.println("treeSet is sorted alphabetically:");
        System.out.println(treeSet);
    }
}
