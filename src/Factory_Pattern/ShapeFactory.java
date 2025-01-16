package Factory_Pattern;




/**
 * Factory class responsible for creating Shape objects.
 */
public class ShapeFactory {

    /**
     * Factory method to get the shape object based on the shape type.
     *
     * @param shapeType The type of the shape.
     * @return The corresponding shape object, or null if no match found.
     */
    public ShapeInterface getShape(String shapeType) {
        if (shapeType == null) {
            return null;
        }

        switch (shapeType.toUpperCase()) {
            case "CIRCLE":
                return new Circle();
            case "RECTANGLE":
                return new Rectangle();
            case "SQUARE":
                return new Square();
            case "TRIANGLE":
                return new Triangle();
            default:
                return null;
        }
    }
}