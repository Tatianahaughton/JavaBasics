package com.syntax.class26;

public abstract class Card {
    String cardType;
    Card(String cardType){
        this.cardType=cardType;
    }
    abstract void creditLimit();
    void signUp() {
        System.out.println("Signing up for "+cardType);
    }
}
class CreditCard extends Card {
   CreditCard(String cardType) {
        super(cardType);
    }
   void creditLimit() {
       System.out.println("Your credit limit is 5000");
    }
    void signUp() {
        super.signUp();
    }
}
class DebitCard extends Card {
    DebitCard(String cardType) {
        super(cardType);
    }
    @Override
    void creditLimit() {
        System.out.println("The limit is what's in your banking account");
    }
    @Override
    void signUp() {
        super.signUp();
    }
}
class BusinessCard extends Card {
    BusinessCard(String cardType){
        super(cardType);
    }
    @Override
    void creditLimit() {
        System.out.println("Your limit on this card is 10000");
    }
    @Override
    void signUp() {
        super.signUp();
    }

    }

