package com.syntax.class15;

public class PrimeMethod {

    boolean isPrime(int num) {
        boolean isPrime = true;
        if (num > 1) {

            for (int i = 2; i < num; i++) {
                if (num % i == 0) {
                    isPrime = true;
                    break;
                }
            }
        } else {
            isPrime = false;
        }
        return isPrime;
    }

    public static void main(String[] args) {
        PrimeMethod obj=new PrimeMethod();
        System.out.println(obj.isPrime(12));
    }
}
