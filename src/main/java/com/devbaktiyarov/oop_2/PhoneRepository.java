package com.devbaktiyarov.oop_2;

public class PhoneRepository implements Repository{

    @Override
    public void save(Phone phone) {
        System.out.println("Phone saved");
    }

    void list() {
        System.out.println("DB list");
    }
    
}
