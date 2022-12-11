package com.syntax.class26;

import java.util.ArrayList;

public class InsuranceTest {
    public static void main(String[] args) {
        ArrayList<Insurance> list=new ArrayList<>();
list.add(new Car("Geico","CRV"));
list.add(new Pet("Anthem","dog"));
list.add(new Health("Blue Cross"));

        for(var insurance:list) {
            insurance.getQuote();
            insurance.cancelInsurance();
        }
    }
}
