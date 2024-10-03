package com.devbaktiyarov.oop.inheritance;

import com.devbaktiyarov.oop.Animal;

public class Cat extends Animal{
    
    public String color;
    

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    public Cat() {}

    public void meow() {
        Animal animal = new Animal();
        System.out.println("Meow");
    }

    @Override
    public void eat() { // Сигнатура
        System.out.println("Cat eats");
    }

    @Override
    public void voice() {
        System.out.println("Cat voice///////////");
    }



    



    

    



    

}
