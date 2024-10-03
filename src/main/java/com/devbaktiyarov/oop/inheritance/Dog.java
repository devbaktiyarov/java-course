package com.devbaktiyarov.oop.inheritance;

import com.devbaktiyarov.oop.Animal;

public class Dog extends Animal {

    public String breed;

    public Dog(String name, String breed) {
        super(name);
        this.breed = breed;
    }

    


}
