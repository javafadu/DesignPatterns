package BehavioralDP.ChainOfResponsibilityDP;

public abstract class Approver {

    Approver chief;

    public Approver(Approver chief) {
        this.chief = chief;
    }

    abstract boolean approveLoan(int amount);
}
