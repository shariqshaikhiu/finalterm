package Factory_Pattern;


/**
 * Concrete class representing a Circle.
 */
public class Square implements ShapeInterface {

    /**
     * Draws a circle.
     */
    @Override
    public void draw() {
        System.out.println("Drawing a Square");
    }
}
