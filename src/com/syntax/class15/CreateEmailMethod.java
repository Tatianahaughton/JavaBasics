package com.syntax.class15;

public class CreateEmailMethod {

    String createEmail(String firstName, String lastName, String emailType) {
        return (firstName + lastName + "@" + emailType + ".com").toLowerCase();
    }

    public static void main(String[] args) {
        CreateEmailMethod obj = new CreateEmailMethod();
        {
           // String fullEmail = obj.createEmail("John"lastName"Snow",emailType"gmail);
            System.out.println();

        }
    }
}



