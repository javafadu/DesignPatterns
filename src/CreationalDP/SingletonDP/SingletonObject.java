package CreationalDP.SingletonDP;

public class SingletonObject {

    String message = "Hello";


    // 1- Change the default constructor from public to private to prevent crating object in different classes
    private SingletonObject() {
    }

    // 2- Create a private static object in the same class only one time
    private static SingletonObject instance = new SingletonObject();


    // 3- Create a public static method to return the static object
    public static SingletonObject getInstance() {
        return instance;
    }

    // test method
    public void showMessage() {
        this.message = this.message + " World";
        System.out.println(this.message);
    }

}
