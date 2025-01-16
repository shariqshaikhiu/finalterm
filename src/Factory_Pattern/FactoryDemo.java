package Factory_Pattern;


/**
 * Demo class to demonstrate the Factory Pattern.
 */
public class FactoryDemo {

    /**
     * The main method to run the Factory Pattern example.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        // Create the factory
        ShapeFactory shapeFactory = new ShapeFactory();

        // Create and draw a Circle
        ShapeInterface shape1 = (ShapeInterface) shapeFactory.getShape("CIRCLE");
        shape1.draw();

        // Create and draw a Rectangle
        ShapeInterface shape2 = (ShapeInterface) shapeFactory.getShape("RECTANGLE");
        shape2.draw();

        // Create and draw a Square
        ShapeInterface shape3 = (ShapeInterface) shapeFactory.getShape("SQUARE");
        shape3.draw();

        // Create and draw a Triangle
        ShapeInterface shape4 = shapeFactory.getShape("TRIANGLE");
        shape4.draw();
    }
}