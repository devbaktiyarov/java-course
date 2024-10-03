package com.devbaktiyarov.oop;

public class Dog extends Animal{
    
    String breed;

    public Dog(String name, String breed) {
        super(name); // Вызов конструктора родителя
        this.breed = breed;
    }


    @Override
    public void eat() {
        System.out.println("Dog eats");
    }

    @Override
    public void voice() {
        // super.voice(); // Вызов метода родителя 
        System.out.println("Dog voice ---------");
    }




    void bark() {
        System.out.println("Barks");
    }


}

class Name {
    public String name;
}

