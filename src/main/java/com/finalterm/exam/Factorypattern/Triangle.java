package com.finalterm.exam.Factorypattern;

public class Triangle implements Shape{

    /**
     * Draws a triangle shape.
     * This method is an implementation of the draw() method from the Shape interface.
     * It prints a message indicating that a triangle is being drawn.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a triangle");
    }
}
