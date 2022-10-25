package com.syntax.class21;

public class CreditCardTest {
    public static void main(String[] args) {
        CreditCard card=new CreditCard();
        card.calculateInterest(1000);

        Visa visaCard=new Visa();
        visaCard.calculateInterest(2000);

        AX axCard=new AX();
        axCard.calculateInterest(3000);
    }
}
