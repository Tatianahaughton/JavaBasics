package com.syntax.class13;

import java.util.Scanner;

public class ScannerDemoString {
    public static void main(String[] args) {
        String userName;
        String password;
        String confirmPassword;

        Scanner answer = new Scanner(System.in);
        System.out.println("Enter user name");
        userName = answer.next();
        System.out.println("Enter password");
        password = answer.next();
        System.out.println("Confirm password");
        confirmPassword = answer.next();

        if (userName.isEmpty() || password.isEmpty()) {
            System.out.println("User name ans Password cannot be empty");
        } else if (password.length() < 8) {
            System.out.println("Password is too short");
        } else if (password.contains(userName)) {
            System.out.println("Password cannot contain username");
        } else if (!password.equals(confirmPassword)) {
            System.out.println("Passwords do not match");
        } else {
            System.out.println("your username and password have been created");

        }
    }
}
