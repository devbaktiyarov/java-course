package com.devbaktiyarov.object;

public class Main {
    public static void main(String[] args) {
        
        Smartphone smartphone = new Smartphone("I", 12);

        // Smartphone smartphone1 = new Smartphone("I", 12);


        // System.out.println();


        // Cat cat = new Cat("r");

        // Cat cat1 = new Cat("r");

        // System.out.println();

        Dog dog = new Dog(2, "oo");
        Dog dog2 = new Dog(2, "6");
        Dog dog3 = null;

        System.out.println(dog.hashCode());

        System.out.println(dog2.hashCode());

        // System.out.println(User.ADMIN);

        // System.out.println(dog);
        // System.out.println(dog2);

        System.out.println(dog.name.hashCode());

        System.out.println(dog.equals(dog3));


        System.out.println("c" + dog.equals(smartphone));

        System.out.println(dog == dog2);

        System.out.println(dog);

        System.out.println(dog2);

        // System.out.println(cat);

        // System.out.println("-");
        // System.out.println(dog.equals(dog2));
        // System.out.println(dog.hashCode());
        // System.out.println(dog2.hashCode());
        // System.out.println("-");
        // System.out.println(cat.hashCode() == dog.hashCode());
        // System.out.println(cat.equals(dog));


        // System.out.println();
        // System.out.println(smartphone.equals(smartphone1));

        // System.out.println(MathOOP.sum(2, 2));
        // // Math
        // System.out.println(MathOOP.count);


    }
}
