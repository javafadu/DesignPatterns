package StructuralDP.DecoratorDP;

public class IPhone11Pro extends PhoneDecorator{
    public IPhone11Pro(IPhone basicPhone) {
        super(basicPhone);
    }

    @Override
    public String getName() {
        return super.getName()+"11 Pro";
    }

    @Override
    public double getPrice() {
        return super.getPrice()+100;
    }

    @Override
    public int cameraCount() {
        return super.cameraCount()+1;
    }
}
