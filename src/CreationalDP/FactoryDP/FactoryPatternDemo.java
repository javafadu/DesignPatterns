package CreationalDP.FactoryDP;

public class FactoryPatternDemo {
    public static void main(String[] args) {
    /*
        Circle circle1 = new Circle();
        circle1.draw();

     */
        // We do not need to know domain class of to be created object?
        // How can we create an object from Circle, Square or Rectangle

        ShapeFactory shapeFactory = new ShapeFactory();
        Shape shape1 = shapeFactory.getShape("Circle");
        shape1.draw();

        Shape shape2 = shapeFactory.getShape("square");
        shape2.draw();

        Shape shape3 = shapeFactory.getShape("Rectangle");
        shape3.draw();




    }
}
