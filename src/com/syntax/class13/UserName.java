package com.syntax.class13;

public class UserName {
    public static void main(String[] args) {
        String userName = "user1";
        String password = "pass123";
        String confirmPassword = "passs123";

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
