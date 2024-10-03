package com.devbaktiyarov.oop;

public class Animal {
    public String name;
    
    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public void eat() { // сигнатура
        System.out.println("Eat animal");
    }


    public void voice() {
        System.out.println("animal voice");
    }


    String name() {
        return name;
    }


}
