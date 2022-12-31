package CreationalDP.SingletonDP;

public class SingletonRunner {
    public static void main(String[] args) {

        // SingletonObject object2 = new SingletonObject(); not works

        SingletonObject object2 = SingletonObject.getInstance();
        System.out.println(object2.message);
        object2.showMessage();

        // test if it created single object or not
        SingletonObject object3 = SingletonObject.getInstance();
        System.out.println(object3.message);

        // object2 and object3 are same

    }
}
