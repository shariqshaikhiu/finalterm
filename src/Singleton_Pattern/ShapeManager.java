package Singleton_Pattern;

/**
 * Singleton class to manage shapes.
 * Ensures only one instance of ShapeManager exists.
 */
public class ShapeManager {

    // Single instance of ShapeManager
    private static ShapeManager instance;

    /**
     * Private constructor to prevent instantiation.
     */
    private ShapeManager() {
        // Initialization logic if needed
    }

    /**
     * Provides the single instance of ShapeManager.
     *
     * @return The single instance of ShapeManager.
     */
    public static ShapeManager getInstance() {
        if (instance == null) {
            synchronized (ShapeManager.class) {
                if (instance == null) {
                    instance = new ShapeManager();
                }
            }
        }
        return instance;
    }

    /**
     * Displays the type of shape.
     *
     * @param shapeType The type of the shape.
     */
    public void displayShape(String shapeType) {
        System.out.println("The shape is: " + shapeType);
    }
}