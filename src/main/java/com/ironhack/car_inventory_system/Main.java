package com.ironhack.car_inventory_system;

public class Main {
    public static void main(String[] args) {
        Sedan sedan = new Sedan(
                "VIN12345",
                "Toyota",
                "Camry",
                50000
        );

        UtilityVehicle suv = new UtilityVehicle(
                "VIN54321",
                "Honda",
                "CR-V",
                30000,
                true
        );

        Truck truck = new Truck(
                "VIN99999",
                "Ford",
                "F-150",
                75000,
                10000.5
        );

        System.out.println(sedan.getInfo());
        System.out.println(suv.getInfo());
        System.out.println(truck.getInfo());
    }
}
