package CreationalDP.PrototypeDP;

public class PrototypeDPRunner {
    public static void main(String[] args) {
        Soldier availableSoldier = new Soldier(100,50,10,80,70,3,"Gun",true);

        // create a soldier with cloning feature
        Soldier notAvailableSoldier = availableSoldier.clone();
        notAvailableSoldier.setAvailableForWar(false);



    }
}
