package com.devbaktiyarov.oop.vehicle;

public class Main {
    public static void main(String[] args) {
        // Создаем несколько автомобилей и мотоциклов
        Vehicle car1 = new Car("Toyota Camry", 50, 4);
        Vehicle motorcycle1 = new Motorcycle("Harley Davidson", 20, true);
        Vehicle car2 = new Car("Honda Accord", 60, 4);
        Vehicle motorcycle2 = new Motorcycle("Yamaha", 15, false);

        // Создаем автопарк
        Fleet fleet = new Fleet();

        // Добавляем транспортные средства в автопарк
        fleet.addVehicle(car1);
        fleet.addVehicle(motorcycle1);
        fleet.addVehicle(car2);
        fleet.addVehicle(motorcycle2);

        // Все транспортные средства начинают движение
        fleet.makeAllVehiclesDrive();
    }
}
