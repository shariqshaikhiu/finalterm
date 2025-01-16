package Factory_Pattern;


/**
 * Concrete class representing a Circle.
 */
public class Rectangle implements Factory_Pattern.ShapeInterface {

    /**
     * Draws a circle.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Rectangle");
    }
}