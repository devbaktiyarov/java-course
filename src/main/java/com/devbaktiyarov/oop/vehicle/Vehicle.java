package com.devbaktiyarov.oop.vehicle;

import java.util.ArrayList;
import java.util.List;

// Абстрактный класс Транспортное средство
abstract class Vehicle {
    protected String model;
    protected double fuelLevel;

    // Конструктор
    public Vehicle(String model, double fuelLevel) {
        this.model = model;
        this.fuelLevel = fuelLevel;
    }

    // Метод для пополнения топлива
    public void refuel(double amount) {
        fuelLevel += amount;
        System.out.println("Пополнено топливо на " + amount + " литров. Текущее количество топлива: " + fuelLevel);
    }

    // Абстрактный метод для движения
    public abstract void drive();
}

// Класс Автомобиль
class Car extends Vehicle {
    private int numberOfDoors;

    public Car(String model, double fuelLevel, int numberOfDoors) {
        super(model, fuelLevel);  // Вызов конструктора родительского класса
        this.numberOfDoors = numberOfDoors;
    }

    // Переопределение метода для движения
    @Override
    public void drive() {
        System.out.println(model + " едет. Это автомобиль с " + numberOfDoors + " дверями.");
    }
}

// Класс Мотоцикл
class Motorcycle extends Vehicle {
    private boolean hasSidecar;

    public Motorcycle(String model, double fuelLevel, boolean hasSidecar) {
        super(model, fuelLevel);  // Вызов конструктора родительского класса
        this.hasSidecar = hasSidecar;
    }

    // Переопределение метода для движения
    @Override
    public void drive() {
        String sidecarMessage = hasSidecar ? "с боковым прицепом" : "без бокового прицепа";
        System.out.println(model + " едет. Это мотоцикл " + sidecarMessage + ".");
    }
}

// Класс Автопарк
class Fleet {
    private List<Vehicle> vehicles;

    // Конструктор
    public Fleet() {
        this.vehicles = new ArrayList<>();
    }

    // Метод для добавления транспортного средства в автопарк
    public void addVehicle(Vehicle vehicle) {
        vehicles.add(vehicle);
    }

    // Метод для того, чтобы все транспортные средства в автопарке начали движение
    public void makeAllVehiclesDrive() {
        for (Vehicle vehicle : vehicles) {
            vehicle.drive();
        }
    }
}

// Класс с методом main
