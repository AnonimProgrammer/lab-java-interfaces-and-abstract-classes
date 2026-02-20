package com.ironhack.car_inventory_system;

public class Truck extends Car {
    private double towingCapacity;

    public Truck(String vinNumber, String make, String model, int mileage, double towingCapacity) {
        super(vinNumber, make, model, mileage);
        setTowingCapacity(towingCapacity);
    }

    @Override
    public String getInfo() {
        return super.getInfo() +
                ", TowingCapacity: " + towingCapacity;
    }

    public double getTowingCapacity() {
        return towingCapacity;
    }

    public void setTowingCapacity(double towingCapacity) {
        if (towingCapacity < 0) {
            throw new IllegalArgumentException("Towing capacity cannot be negative");
        }
        this.towingCapacity = towingCapacity;
    }
}
