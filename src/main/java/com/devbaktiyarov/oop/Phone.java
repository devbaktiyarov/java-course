package com.devbaktiyarov.oop;

public class Phone {
    
    int number;
    String model;
    double weight;
    
    public Phone() {}

    public Phone(int number, String model) {
        this.number = number;
        this.model = model;
    }

    public Phone(int number, String model, double weight) {
        this.number = number;
        this.model = model;
        this.weight = weight;
    }

    void receiveCall(String name) {
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, String phone) {
        System.out.println("Звонит: " + name + " Номер " + phone);
    }

    public int getNumber() {
        return number;
    }

    public static void main(String[] args) {
        Phone phone = new Phone(996, "samsung", 150.0);
        System.out.println(phone.getNumber());
        phone.receiveCall("Cris");
        phone.receiveCall("Antony", "777");
    }
}
