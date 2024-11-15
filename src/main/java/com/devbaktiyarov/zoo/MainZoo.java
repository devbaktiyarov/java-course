package com.devbaktiyarov.zoo;

public class MainZoo {
    public static void main(String[] args) {
        Zoo zoo = new Zoo();

        AnimalKey lionKey = new AnimalKey(1, "Simba");
        Animal lion = new Lion("Simba", 5, "lion");

        AnimalKey elephantKey = new AnimalKey(2, "Dumbo");
        Animal elephant = new Elephant("Dumbo", 10, "Elephant");

        zoo.add(lionKey, lion);
        zoo.add(elephantKey, elephant);

        zoo.findByName("Dumbo");

        

    }
}
