package com.devbaktiyarov.oop;

import com.devbaktiyarov.basics.Lesson1;

public class MainAnimal1 {
    public static void main(String[] args) {
        Dog dog = new Dog("Bob", "Pitbull");
        dog.eat();
        dog.voice();
        
        Cat cat4 = new Cat();
        cat4.name = "name";
        System.out.println("Cat oop " + cat4.color);



        Lesson1 l = new Lesson1();

        Animal dog1 = new Dog("Muhtar", "Ovcharka");
        dog1.voice();
        dog1.eat();

        System.out.println("------------");

        Animal cat = new Dog("Dog1", "poroda");
        cat.voice();
        cat.eat();


        System.out.println("----------------    ");

        MathUtils math = new MathUtils();
        
        
       System.out.println(math.add(2, 3));        // Вывод: 5
       System.out.println(math.add(2.0, 3));    // Вывод: 6.0
       System.out.println(math.add(1, 2, 3));      // Вывод: 6

       math.print();

        


    }
}
