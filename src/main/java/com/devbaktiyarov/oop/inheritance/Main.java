package com.devbaktiyarov.oop.inheritance;

import com.devbaktiyarov.oop.Animal;
import com.devbaktiyarov.oop.Dog;

public class Main {
    

    public static void main(String[] args) {
        // Dog dog = new Dog("Dog1", "Pitbull");
        // System.out.println();

        // Animal animal = new Dog("Dog2", "Breed2");
        // // animal.voice();
    

        Computer computer = new Computer();
        // computer.model = "uehf";

        computer.setModel("Acer");
        computer.setPrice(100);

        computer.sum(1, 2);
        computer.minus(10, 1);
        // computer.print(1, 2);
        System.out.println(computer.getModel());
        System.out.println(computer.getPrice());

        // computer.print(); 

    }

}
