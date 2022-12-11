package com.syntax.class26;

import java.util.LinkedList;

public class CardTest {
    public static void main(String[] args) {
        LinkedList<Card> cards = new LinkedList<>();
        cards.add(new CreditCard("Visa"));
        cards.add(new DebitCard("Wells Fargo"));
        cards.add(new BusinessCard("Master Card"));

        for (var card : cards) {
            card.signUp();
            card.creditLimit();
        }
    }
}
