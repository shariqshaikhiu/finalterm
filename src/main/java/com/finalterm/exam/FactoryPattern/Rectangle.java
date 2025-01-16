package com.finalterm.exam.FactoryPattern;

/**
 * This class represents a Rectangle shape.
 * It implements the Shape interface and provides a specific implementation
 * for drawing a rectangle.
 */
public class Rectangle implements Shape {

    /**
     * Draws a rectangle shape.
     * This method overrides the draw method from the Shape interface.
     * It prints a message indicating that a rectangle shape is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Rectangle shape");
    }
}