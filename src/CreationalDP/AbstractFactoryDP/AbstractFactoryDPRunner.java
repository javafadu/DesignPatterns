package CreationalDP.AbstractFactoryDP;

public class AbstractFactoryDPRunner {
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("shape");

        Shape shape1 = shapeFactory.getShape("circle");
        shape1.draw();
        // circle object is created

        Shape shape2 = shapeFactory.getShape("rectangle");
        shape2.draw();
        // rectangle object is created

        AbstractFactory colorFactory = FactoryProducer.getFactory("color");

        Color color1=colorFactory.getColor("red");
        color1.fill();
        // red object is created

        Color color2=colorFactory.getColor("blue");
        color2.fill();


    }
}
