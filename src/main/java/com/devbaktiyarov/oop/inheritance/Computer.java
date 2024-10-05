package com.devbaktiyarov.oop.inheritance;

public class Computer {
    
    private String model;
    private int price;
    private int a;

    private void print(int a, int b) {
        System.out.println("a=" + a + " b=" + b);
    }


    public void sum(int a, int b) {
        System.out.println(a+b);
        print(a, b);
    }

    public void minus(int a, int b) {
        System.out.println(a-b);
        print(a, b);
    }




    public String getModel() {
        return model;
    }





    public void setModel(String model) {
        this.model = model;
    }





    public int getPrice() {
        return price;
    }





    public void setPrice(int price) {
        this.price = price;
    }

}
