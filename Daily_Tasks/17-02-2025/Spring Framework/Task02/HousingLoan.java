package task02;

public class HousingLoan {
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
        System.out.println("Housing Loan: Interest Rate = " + interestRate + "%, Duration = " + duration + " years.");
    }
}
