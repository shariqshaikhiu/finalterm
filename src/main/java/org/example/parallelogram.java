// Concrete Factories
class CircleFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Circle();
    }
}

class RectangleFactory extends ShapeFactory {
    @Override
    Shape createShape() {
        return new Rectangle();
    }
}

// Main Class
public class FactoryMethodEx
