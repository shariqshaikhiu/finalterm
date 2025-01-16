package com.finalterm.exam.Factorypattern;

/**
 * This class demonstrates the usage of the Factory Pattern for creating different shapes.
 * It uses a ShapeFactory to create instances of various Shape objects and calls their draw methods.
 */
public class FactoryPattern {

    /**
     * The main method that serves as the entry point for the Factory Pattern demonstration.
     * It creates a ShapeFactory and uses it to create different Shape objects.
     *
     * @param args Command line arguments (not used in this demonstration)
     */
    public static void main(String[] args) {
        // Create an instance of ShapeFactory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Demonstrate creating and using a Circle
        Shape shape1 = shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Demonstrate creating and using a Rectangle
        Shape shape2 = shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Demonstrate creating and using a Triangle
        Shape shape3 = shapeFactory.getShape("TRIANGLE");
        shape3.draw();
    }
}