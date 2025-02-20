package task02;

public class VehicleLoan {
    private double interestRate;
    private int duration;

    // Setter Injection
    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void setTenure(int duration) {
        this.duration = duration;
    }

    public void displayLoanDetails() {
        System.out.println("Vehicle Loan: Interest Rate = " + interestRate + "%, Duration = " + duration + " years.");
    }
}

