package com.devbaktiyarov.oop_2;

public class Dog extends Animal implements  Predator{

    @Override
    public void print() {
        System.out.println("Bark");      
    }

    @Override
    void cat() {
        // TODO Auto-generated method stub
        
    }

    @Override
    public void attack() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'attack'");
    }

    

    // @Override
    // public void attack() {
    //     System.out.println("Attack");     
    // }


    





    
    
    

}
