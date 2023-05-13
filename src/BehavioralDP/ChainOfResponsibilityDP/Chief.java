package BehavioralDP.ChainOfResponsibilityDP;

public class Chief extends Approver{

    public Chief(Approver chief) {
        super(chief);
    }

    @Override
    boolean approveLoan(int amount) {
        if(amount<500) {
            System.out.println("Chief has approved ");
            System.out.println("****************");
        }else if(chief!=null) {
            System.out.println("The requested amount is out of chief limit, please ask to manager");
            return chief.approveLoan(amount);
        }

        return false;
    }
}
