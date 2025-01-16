package com.finalterm.exam.FactoryPattern;

/**
 * The Shape interface represents a geometric shape.
 * This interface is part of the Factory Pattern implementation.
 * It declares the draw method that all concrete shape classes must implement.
 */
public interface Shape {

    /**
     * Draws the shape.
     * This method should be implemented by all classes that implement the Shape interface.
     * The specific implementation will depend on the type of shape being drawn.
     */
    void draw();
}