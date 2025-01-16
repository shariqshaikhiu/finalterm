
class ShapeFactorySingleton {
    private static ShapeFactorySingleton instance;

    private ShapeFactorySingleton() {}

    public static ShapeFactorySingleton getInstance() {
        if (instance == null) {
            instance = new ShapeFactorySingleton();
        }
        return instance;
    }

    public Shape getShape(String shapeType) {
        if (shapeType == null) return null;

        switch (shapeType.toLowerCase()) {
            case "circle":
                return new Circle();
            case "rectangle":
                return new Rectangle();
            default:
                return null;
        }
    }
}
