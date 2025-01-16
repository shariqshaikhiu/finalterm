package com.finalterm.exam.FactoryPattern;

/**
 * This class represents a Circle shape.
 * It implements the Shape interface and provides a specific implementation
 * for drawing a circle.
 */
public class Circle implements Shape {

    /**
     * Draws a circle shape.
     * This method overrides the draw method from the Shape interface.
     * It prints a message indicating that a circle shape is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Circle shape");
    }
}