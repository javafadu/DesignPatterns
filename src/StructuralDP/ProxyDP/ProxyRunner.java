package StructuralDP.ProxyDP;

public class ProxyRunner {

    public static void main(String[] args) {

        ProxyClass proxyClass1 = new ProxyClass("C:\\Users\\FEO\\Downloads\\image1.jpg");
        ProxyClass proxyClass2 = new ProxyClass("C:\\Users\\FEO\\Downloads\\image2.jpg");

        // we see only defined method in Proxy Class
        proxyClass1.showImage();
        proxyClass2.showImage();

    }
}
