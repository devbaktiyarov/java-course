package com.devbaktiyarov.oop;

import com.devbaktiyarov.oop.inheritance.Cat;

public class MainAnimal {
    public static void main(String[] args) {
        
        String name = "Bobik";
        Dog dog = new Dog(name, "Pitbull");
        dog.eat();
        dog.voice();
        dog.bark();
        System.out.println(dog.name());


        Cat cat = new Cat("Bars", "White");
        cat.voice();
        cat.eat();
        cat.meow();

        System.out.println();

        MathUtils math = new MathUtils();
        System.out.println(math.add(1, 2));
        System.out.println(math.add(1.2, 2.3));
        System.out.println(math.add(1, 3, 3));
        System.out.println(math.add("Hello", name));
        
        System.out.println(math.add(name, "Dog", name, "Pitbull"));

    }   
}
