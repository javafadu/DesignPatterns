package CreatitionalDP.SingletonDP;

public class SingletonObject {

    String message = "Hello";

    private static SingletonObject instance = new SingletonObject();

    private SingletonObject() {

    }

    public static SingletonObject getInstance() {
        return instance;
    }

}
