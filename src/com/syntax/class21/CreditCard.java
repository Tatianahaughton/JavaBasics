package com.syntax.class21;

//Create a class CreditCard and define variable balance and interest. Create an instance method that will calculate interest based on the given balance.
//Create 2 subclasses: Visa and AX. In AX class override method calculate interest.
//Call the method by creating an object of each of the three classes.

public class CreditCard {
    double balance;
    double interest;

    double calculateInterest(double balance) {

        System.out.println(interest = balance * .15);
        return interest;
    }
}
    class Visa extends CreditCard {

            }
    class AX extends CreditCard {
        double calculateInterest(double balance) {
            System.out.println(interest = balance * .15);
            return interest;
        }
    }






