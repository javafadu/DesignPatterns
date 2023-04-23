package StructuralDP.ProxyDP;

public class RealClass implements ImageGenerator{

    private String fullPath;

    // constructor
    public RealClass(String fullPath) {
        this.fullPath=fullPath;
    }


    @Override
    public void showImage() {
        System.out.println("Show Image: "+fullPath);
    }

    public void changeImage() {

    }

    public void changeFormatOfImage() {

    }

    public void getName() {
        System.out.println("....");
    }

    public void getLName() {
        System.out.println("......");
    }



}
