package com.finalterm.exam.Factorypattern;

public class Circle implements Shape{
    /**
     * Draws a circle shape.
     * This method is an implementation of the draw() method from the Shape interface.
     * It prints a message indicating that a circle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Circle");
    }
}
