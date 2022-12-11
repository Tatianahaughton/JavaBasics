package com.syntax.class24;

//Encapsulating with private fields and Set and get methods

public class Horse {
    private String name;
    private String breed;
    private String color;
    private int age;

    public Horse(String name, String breed, String color, int age) {
        setName(name);
        setBreed(breed);
        setColor(color);
        setAge(age);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name.isEmpty()) {
            System.out.println("Name cant be empty");
        } else {
            this.name = name;
        }
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        if (breed.isEmpty()) {
            System.out.println("Breed cant be empty");
        } else {
            this.breed = breed;
        }
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()) {
            System.out.println("color cant be empty)");
        } else {
            this.color = color;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0) {
            System.out.println("Age cant be negative");
        } else {
            this.age = age;
        }
    }
}




