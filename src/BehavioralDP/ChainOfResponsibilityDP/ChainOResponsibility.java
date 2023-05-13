package BehavioralDP.ChainOfResponsibilityDP;

public class ChainOResponsibility {

    public static void main(String[] args) {
        ChainOResponsibility cor = new ChainOResponsibility();
        cor.chainOfResponsbilityDemo();
    }


    void chainOfResponsbilityDemo() {
        Approver manager = new Manager();
        Approver chief = new Chief(manager);
        Approver clerk = new Clerk(chief);


        System.out.println("Loan Limits: ");
        System.out.println("Clerk : <100");
        System.out.println("Chief : <500");
        System.out.println("Manager : no limit");
        System.out.println("****************");
        System.out.println("Requested Limit : 50");
        clerk.approveLoan(50);
        System.out.println("Requested Limit : 450");
        clerk.approveLoan(450);
        System.out.println("Requested Limit : 1050");
        clerk.approveLoan(1050);

    }
}
