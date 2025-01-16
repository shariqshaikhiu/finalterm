package com.finalterm.exam.FactoryPattern;

/**
 * This class demonstrates the Factory Pattern.
 * The Factory Pattern is a creational pattern that provides an interface for creating objects
 * in a superclass, but allows subclasses to alter the type of objects that will be created.
 */
public class factoryPattern {
    /**
     * The main method that serves as the entry point for the application.
     * It creates shapes using the ShapeFactory and calls their draw methods.
     *
     * @param args Command line arguments (not used in this example)
     */
    public static void main(String[] args) {
        // Create an instance of the ShapeFactory
        shapeFactory shapeFactory = new shapeFactory();

        // Create a Circle shape using the factory and draw it
        Shape circle = shapeFactory.getShape("circle");
        circle.draw();

        // Create a Rectangle shape using the factory and draw it
        Shape rectangle = shapeFactory.getShape("rectangle");
        rectangle.draw();
    }
}