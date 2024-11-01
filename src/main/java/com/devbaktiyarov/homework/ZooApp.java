// package com.devbaktiyarov.homework;

// public class ZooApp {
//     public static void main(String[] args) {
//         Zoo zoo = new Zoo();

//         AnimalKey lionKey = new AnimalKey(1, "Simba");
//         Animal lion = new Lion("Simba", 5);

//         AnimalKey elephantKey = new AnimalKey(2, "Dumbo");
//         Animal elephant = new Elephant("Dumbo", 10);

//         zoo.addAnimal(lionKey, lion);
//         zoo.addAnimal(elephantKey, elephant);

//         System.out.println("Количество животных в зоопарке: " + Zoo.getAnimalCount());

//         zoo.feedAllAnimals();
//         zoo.displayAllAnimals();

//         try {
//             zoo.ageUp(lionKey);
//             System.out.println("Информация о льве после увеличения возраста:");
//             zoo.getAnimalInfo(lionKey);

//             zoo.removeAnimal(elephantKey);
//             System.out.println("Количество животных после удаления: " + Zoo.getAnimalCount());

//             // Попытка найти животное, которого нет
//             zoo.getAnimalInfo(new AnimalKey(3, "Tiger"));
//         } catch (AnimalNotFoundException e) {
//             System.out.println("Ошибка: " + e.getMessage());
//         }
//     }
// }


// final class AnimalKey {
//     private final int id;
//     private final String name;

//     public AnimalKey(int id, String name) {
//         this.id = id;
//         this.name = name;
//     }

//     public int getId() {
//         return id;
//     }

//     public String getName() {
//         return name;
//     }

//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//         AnimalKey that = (AnimalKey) o;
//         return id == that.id && name.equals(that.name);
//     }

//     @Override
//     public int hashCode() {
//         return Objects.hash(id, name);
//     }
// }


// class AnimalNotFoundException extends Exception {
//     public AnimalNotFoundException(String message) {
//         super(message);
//     }
// }

