package com.devbaktiyarov.oop;

public class MainAnimal {
    public static void main(String[] args) {
        
        String name = "Bobik";
        Dog dog = new Dog(name, "Pitbull");
        dog.eat();
        dog.voice();

    }   
}
