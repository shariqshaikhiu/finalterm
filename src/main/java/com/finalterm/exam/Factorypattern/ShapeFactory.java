package com.finalterm.exam.Factorypattern;

public class ShapeFactory {
    /**
     * Creates and returns a Shape object based on the provided shape type.
     * 
     * @param shapeType A String representing the type of shape to create.
     *                  Valid values are "CIRCLE", "RECTANGLE", and "TRIANGLE" (case-insensitive).
     * @return A Shape object of the specified type, or null if the shapeType is null or not recognized.
     */
    public Shape getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }
        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        } else if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        } else if (shapeType.equalsIgnoreCase("TRIANGLE")) {
            return new Triangle();
        }
        return null;
    }
}
