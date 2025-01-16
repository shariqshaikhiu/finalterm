package com.finalterm.exam.FactoryPattern;

/**
 * The shapeFactory class is responsible for creating Shape objects.
 * This class is part of the Factory Pattern implementation.
 * It provides a method to create different types of shapes based on a given shape type.
 */
public class shapeFactory {

    /**
     * Creates and returns a Shape object based on the given shape type.
     *
     * @param shapeType A String representing the type of shape to create.
     *                  Valid values are "CIRCLE" and "RECTANGLE" (case-insensitive).
     * @return A Shape object of the specified type, or null if the type is invalid or null.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        return null;
    }
}