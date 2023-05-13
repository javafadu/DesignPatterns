package BehavioralDP.ChainOfResponsibilityDP;

public class Manager extends Approver{
    public Manager() { // there is no upper authority
        super(null);
    }

    @Override
    boolean approveLoan(int amount) {

            System.out.println("Manager has approved ");
            System.out.println("****************");
            return true;

    }
}
