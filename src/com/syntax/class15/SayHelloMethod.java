package com.syntax.class15;

public class SayHelloMethod {
    void sayHello (String country) {
        switch (country) {
            case "USA" -> System.out.println("Hello");
            case "India" -> System.out.println("Namaste");
            case "Turkiye" -> System.out.println("Merhaba");
            case "Pakistan" -> System.out.println("AOA");
            case "Japan" -> System.out.println("Nihau");
        }
    }
}
