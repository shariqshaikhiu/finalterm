abstract class Shape {
    abstract void draw();
}

// Concrete Shapes
class Circle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Circle");
    }
}

class Rectangle extends Shape {
    @Override
    void draw() {
        System.out.println("Drawing a Rectangle");
    }
}

// Abstract Factory
abstract class ShapeFactory {
    abstract Shape createShape();

    // Common method to use created shape
    public void render() {
        Shape shape = createShape();
        shape.draw();
    }
}

