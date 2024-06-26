package inheritanceAndPolymorphism.example.entities;

//defining that this class will have all data and behavior of class Account (extends)
public class BusinessAccount extends Account {
 
    private Double loanLimit;

    public BusinessAccount() {
        super();
    }

    public BusinessAccount(int number, String holder, Double balance, Double loanLimit) {
        super(number, holder, balance);
        this.loanLimit = loanLimit;
    }

    public Double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(Double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan (double amount) {
        if(amount <= loanLimit) {
            this.deposit(amount);
        }
    }

    public void withdraw(double amount) {
        super.withdraw(amount); //reuse
        this.balance -= 2.0;
    }
}
