package com.devbaktiyarov.oop;

public class Animal {
    String name;
    
    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    void eat() {
        System.out.println("Animal eats");
    }


    void voice() {
        System.out.println("Animal voice");
    }
}
