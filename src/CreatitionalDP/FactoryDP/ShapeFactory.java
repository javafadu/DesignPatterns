package CreatitionalDP.FactoryDP;

public class ShapeFactory {

    public Shape getShape(String shapeType) {

        if (shapeType == null) return null;

        if (shapeType.equalsIgnoreCase("CIRCLE")) {
            return new Circle();
        }
        if (shapeType.equalsIgnoreCase("SQUARE")) {
            return new Square();
        }
        if (shapeType.equalsIgnoreCase("RECTANGLE")) {
            return new Rectangle();
        }
        // if shapeType is not null, is not square, is not circle, is not rectangle
        return null;
    }

}
