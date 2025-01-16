package Singleton_Pattern;


/**
 * Demo class to test the ShapeManager Singleton.
 */
public class ShapeManagerDemo {

    /**
     * The main method to demonstrate the Singleton Pattern.
     *
     * @param args Command-line arguments.
     */
    public static void main(String[] args) {
        // Get the single instance of ShapeManager
        ShapeManager shapeManager = ShapeManager.getInstance();

        // Use the ShapeManager to display shapes
        shapeManager.displayShape("Circle");
        shapeManager.displayShape("Rectangle");
        shapeManager.displayShape("Square");
        shapeManager.displayShape("Triangle");
    }
}