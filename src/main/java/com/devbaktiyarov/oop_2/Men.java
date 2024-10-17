package com.devbaktiyarov.oop_2;

public class Men extends Human implements Runnable, Predator {

    @Override
    void run() {
        System.out.println("Men run");
    }

    @Override
    public void runnable() {
        System.out.println("Can run");
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    @Override
    public void print() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'print'");
    }
    
}
