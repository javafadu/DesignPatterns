package BehavioralDP.ChainOfResponsibilityDP;

public class Clerk extends Approver{


    public Clerk(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {

        if(amount<100) {
            System.out.println("Clerk has approved ");
            System.out.println("****************");
        }else if(chief!=null) {
            System.out.println("The requested amount is out of clerk limit, please ask to chief");
            return chief.approveLoan(amount);
        }

        return false;
    }
}
