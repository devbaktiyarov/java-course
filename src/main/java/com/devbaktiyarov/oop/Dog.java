package com.devbaktiyarov.oop;

public class Dog extends Animal {
    
    String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    @Override
    void eat() {
        System.out.println("Dog eats");        
    }

    
    

}
