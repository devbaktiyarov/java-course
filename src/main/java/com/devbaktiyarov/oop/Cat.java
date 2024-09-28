package com.devbaktiyarov.oop;

public class Cat extends Animal{
    
    String color;

    public Cat() {}

    public Cat(String name, String color) {
        super(name);
        this.color = color;
    }

    @Override
    void voice() {
        System.out.println("Meow");
    }

    @Override
    void eat() {
        System.out.println("Cat eats");
    }



    

    



    

}
