package StructuralDP.ProxyDP;

public class ProxyClass implements ImageGenerator{


    private RealClass realClass;
    private String fullPath;

    // constructor with one parameter
    public ProxyClass(String fullPath) {
        this.fullPath=fullPath;
    }

    // Only one method (show image) we need with this proxy
    @Override
    public void showImage() {
        if(realClass==null) {
            realClass = new RealClass(fullPath);
            realClass.showImage();
        }
    }
}
