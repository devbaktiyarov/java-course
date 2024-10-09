package com.devbaktiyarov.object;


public class Smartphone {

    private String model;
    private int price;

    public Smartphone(String model, int price) {
        this.model = model;
        this.price = price;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) 
            return true;
        if (obj == null || getClass() != obj.getClass()) 
            return false;
        Smartphone smartphone = (Smartphone) obj;
        return price == smartphone.price && model.equals(smartphone.model);
    }

    @Override
    public int hashCode() {
        return 44777 * model.hashCode() + price;
    }

    @Override
    public String toString() {
        return "Model name : " + model + " : " + price;
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