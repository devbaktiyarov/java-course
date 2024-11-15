package com.devbaktiyarov.zoo;

import java.util.HashMap;
import java.util.Map;

public class Zoo {
    HashMap<AnimalKey, Animal> animals = new HashMap<>();


    public void add(AnimalKey key, Animal animal) {
        animals.put(key, animal);
    }


    public void delete(AnimalKey animalKey) {
        animals.remove(animalKey);
    }

    public void findByName(String animalName) {
        for(Map.Entry<AnimalKey, Animal> item : animals.entrySet()) {
            if(item.getValue().name.equals(animalName)) {
                System.out.println(item.getKey());
                System.out.println(item.getValue());
            }
            
        }
    }





}
