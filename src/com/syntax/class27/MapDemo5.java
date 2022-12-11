package com.syntax.class27;

import java.util.HashMap;

public class MapDemo5 {
    public static void main(String[] args) {
        //Collection is a parent of everything inside Collections framework, so it can hold a child of all those classes?
        HashMap<String,Double> fruit = new HashMap<>();
        fruit.put("Apple", 3.99);
        fruit.put("Mango", 2.99);
        fruit.put("Oranges", 4.99);
        fruit.put("Bananas", 1.99);

        //.values method converts values into collections

       /* Collection <Double> values=fruit.values(); //returns all the values in a map

        Iterator<Double>iterator=values.iterator();
        while(iterator.hasNext()){

            Double value=iterator.next();//Double(Wrapper type as what we stored values in)
            if(value>2) {
                iterator.remove();) {

                }
            }
*/                         //Use lambda expression to simplify code
            fruit.values().removeIf(x->x>2);//takes each value and stores it into x; then looks at condition x>2
            //enother example: fruit.keySet().removeIf(y->y.contains("n"));
            System.out.println(fruit);//same output as from line 18-28
        }

    }

