package inheritanceAndPolymorphism.example.entities;

//FINAL - prevents the class from being inherited
public final class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount() {
        super();
    }

    public SavingsAccount(int number, String holder, Double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }
     //indicating that it is an overload/override of the method
    @Override
    //FINAL - prevents the method from being override again or once
    public final void withdraw(double amount) {
        this.balance -= amount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }
    
    public void updateBalance() {
        this.balance += this.balance * interestRate; 
    }
}
