package com.finalterm.exam.Question2;

public class Question2 {
    public static void main(String[] args) {
        // Demonstrating the four pillars of OOP

        // Creating a Car object
        Car myCar = new Car("Toyota", "Corolla");

        // Abstraction and Inheritance
        myCar.startEngine(); // Using method from abstract class

        // Encapsulation
        myCar.setSpeed(60);
        System.out.println("Current speed: " + myCar.getSpeed() + " km/h");
        System.out.println("Fuel level: " + myCar.getFuelLevel() + "%");

        // Polymorphism
        Vehicle vehicle = myCar; // Upcasting
        vehicle.honk(); // This will call Car's overridden honk method

        // Specific behavior
        myCar.accelerate(20);

        myCar.stopEngine();
    }
}