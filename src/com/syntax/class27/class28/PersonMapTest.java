package com.syntax.class27.class28;

import java.util.TreeMap;

public class PersonMapTest {
    public static void main(String[] args) {
        TreeMap<Integer,PersonMap> person=new TreeMap<>();
        person.put(122, new PersonMap("Tatiana","Blah",36,100000));
        person.put(345, new PersonMap("John","Smith",30,90000));
        person.put(567, new PersonMap("Brian","Blah",45,870000));
        person.put(897, new PersonMap("Alex","Blah",34,98000));
        for(var eachPerson:person.keySet()) {
           person.get(eachPerson).printDetails();
        }
    }
}
