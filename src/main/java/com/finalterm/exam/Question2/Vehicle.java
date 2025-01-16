package com.finalterm.exam.Question2;

public abstract class Vehicle {
    protected String brand;
    protected String model;

    public Vehicle(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    // Abstract methods (common behaviors)
    public abstract void startEngine();
    public abstract void stopEngine();

    // Common method
    public void honk() {
        System.out.println("Beep beep!");
    }
}