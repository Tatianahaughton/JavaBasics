package com.syntax.class24;
//Encapsulation=get private variables, provide public setter and getter methods to modify and view variables

public class Dog {

    private String name;
    private String breed;
    private int age;
    private double weight;

    public Dog(String name, String breed, int age, double weight) {
        setName(name);
        setBreed(breed);
        setAge(age);
        setWeight(weight);
    }

    void setName(String name) {
        if (name.length() > 30) {
            System.out.println("Name can't be more than 30 letters. Please try again");
        } else if (name.isEmpty()) {
        } else if (name.isEmpty()) {
            System.out.println("Name can't be empty Please try again");
        } else {
            this.name = name;
        }
    }

    void setWeight(double weight) {
        if (weight < 0) {
            System.out.println("Negative weight is not allowed. Please try again");
        } else if (weight > 300) {
        } else if (weight > 300) {
            System.out.println("Please try less than 300 it looks more of a elephant");
        } else {
            this.weight = weight;
        }
    }

    void setAge(int age) {
        if (age > 20) {
            System.out.println("Please use less age something seems wrong here are you sure its a dog?");
        } else if (age < 0) {
        } else if (age < 0) {
            System.out.println("age can't be negative");
        } else {
            this.age = age;
        }
    }
                    void setBreed (String breed){
                        if (breed.length() > 20) {
                            System.out.println("Breed can't be more than 20 letters. Please try again");
                        } else if (breed.isEmpty()) {
                            System.out.println("Breed can't be empty Please try again");
                        } else {
                            this.breed = breed;
                        }
                    }
                        String getName () {
                            return name;
                        }
                        String getBreed () {
                            return breed;
                        }
                        int getAge () {
                            return age;
                        }
                        double getWeight () {
                            return weight;
                        }
                        void printInfo () {
                            System.out.println("Name " + name + " Breed " + breed + " Age " + age + " Weight " + weight);
                        }
                    }

