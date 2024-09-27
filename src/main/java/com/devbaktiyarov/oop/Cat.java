package com.devbaktiyarov.oop;

public class Cat {
    
    String name;
    String color;
    int age;


    public Cat() {}

    public Cat(String name, String color, int age) {
        this.name = name;
        this.color = color;
        this.age = age;
    }



    String voice() {
        return "Meow";
    }

}
