package com.finalterm.exam.Question2;

public class Car extends Vehicle {
    // Encapsulation: private fields
    private int speed;
    private double fuelLevel;

    public Car(String brand, String model) {
        super(brand, model);
        this.speed = 0;
        this.fuelLevel = 100.0; // Full tank
    }

    // Getter and Setter methods (Encapsulation)
    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed >= 0 && speed <= 200) {
            this.speed = speed;
        } else {
            System.out.println("Invalid speed value");
        }
    }

    public double getFuelLevel() {
        return fuelLevel;
    }

    private void setFuelLevel(double fuelLevel) {
        if (fuelLevel >= 0 && fuelLevel <= 100) {
            this.fuelLevel = fuelLevel;
        } else {
            System.out.println("Invalid fuel level");
        }
    }

    // Implementing abstract methods (Inheritance)
    @Override
    public void startEngine() {
        System.out.println("Car engine started. Vroom vroom!");
    }

    @Override
    public void stopEngine() {
        System.out.println("Car engine stopped.");
    }

    // Polymorphism: Overriding the honk method
    @Override
    public void honk() {
        System.out.println("Car horn: Beep beep beep!");
    }

    // Specific behavior for Car
    public void accelerate(int increment) {
        setSpeed(getSpeed() + increment);
        setFuelLevel(getFuelLevel() - (increment * 0.1)); // Decrease fuel as car accelerates
        System.out.println("Car accelerating. Current speed: " + getSpeed() + " km/h");
    }
}