package CreationalDP.PrototypeDP;

public class Soldier implements Cloneable {

    private int health;
    private int speed;
    private int maxLifeTime;
    private int agility;
    private int power;
    private int rank;
    private String weapon;
    private boolean isAvailableForWar;


    // Constructor (parameterized)
    public Soldier(int health, int speed, int maxLifeTime, int agility, int power, int rank, String weapon, boolean isAvailableForWar) {
        this.health = health;
        this.speed = speed;
        this.maxLifeTime = maxLifeTime;
        this.agility = agility;
        this.power = power;
        this.rank = rank;
        this.weapon = weapon;
        this.isAvailableForWar = isAvailableForWar;
    }

    // Soldier Info
    public void showSoldierInfo() {
        System.out.println("Health : "+health);
        System.out.println("Speed : "+speed);
        System.out.println("Max Life Time : "+maxLifeTime);
        System.out.println("Agility: "+agility);
        System.out.println("Power: "+power);
        System.out.println("Rank: "+rank);
        System.out.println("Weapon: "+weapon);
        if(isAvailableForWar) {
            System.out.println("Ready for War");
        } else {
            System.out.println("Is not ready for war");
        }
    }

    // Getter Setter starts
    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getMaxLifeTime() {
        return maxLifeTime;
    }

    public void setMaxLifeTime(int maxLifeTime) {
        this.maxLifeTime = maxLifeTime;
    }

    public int getAgility() {
        return agility;
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public String getWeapon() {
        return weapon;
    }

    public void setWeapon(String weapon) {
        this.weapon = weapon;
    }

    public boolean isAvailableForWar() {
        return isAvailableForWar;
    }

    public void setAvailableForWar(boolean availableForWar) {
        isAvailableForWar = availableForWar;
    }

    // Getter Setter ends


    @Override
    public Soldier clone() {

        Soldier soldier = null;
        try {
           soldier = (Soldier) super.clone();

        } catch (CloneNotSupportedException e) {
            System.out.println("Error on cloning soldier");
            e.printStackTrace();
        }

        return soldier;
    }



}
