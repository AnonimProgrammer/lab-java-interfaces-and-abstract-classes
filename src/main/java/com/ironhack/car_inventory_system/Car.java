package com.ironhack.car_inventory_system;

public abstract class Car {
    private String vinNumber;
    private String make;
    private String model;
    private int mileage;

    public Car(String vinNumber, String make, String model, int mileage) {
        setVinNumber(vinNumber);
        setMake(make);
        setModel(model);
        setMileage(mileage);
    }

    public String getInfo() {
        return "VinNumber: '" + vinNumber +
                ", Make: '" + make +
                ", Model: '" + model +
                ", Mileage: " + mileage;
    }

    public String getVinNumber() {
        return vinNumber;
    }

    public void setVinNumber(String vinNumber) {
        if (vinNumber == null) {
            throw new IllegalArgumentException("VinNumber cannot be null");
        }
        this.vinNumber = vinNumber;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        if (make == null) {
            throw new IllegalArgumentException("Make cannot be null");
        }
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model == null) {
            throw new IllegalArgumentException("Model cannot be null");
        }
        this.model = model;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        if (mileage < 0) {
            throw new IllegalArgumentException("Mileage cannot be negative");
        }
        this.mileage = mileage;
    }
}
