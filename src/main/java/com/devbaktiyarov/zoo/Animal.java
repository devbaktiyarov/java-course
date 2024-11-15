package com.devbaktiyarov.zoo;

public abstract class Animal {
    String name;
    int age;
    String type;

    public Animal(String name, int age, String type) {
        this.name = name;
        this.age = age;
        this.type = type;
    }
    public abstract void makeSound();
    public abstract void move();
    
    @Override
    public String toString() {
        return "Animal [name=" + name + ", age=" + age + ", type=" + type + "]";
    }

    
}
