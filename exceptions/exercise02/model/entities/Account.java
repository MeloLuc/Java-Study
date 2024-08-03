package exceptions.exercise02.model.entities;

import exceptions.exercise02.model.exceptions.DepositException;
import exceptions.exercise02.model.exceptions.WithdrawException;

public class Account {
   
    private Integer number;
    private String holder;
    private Double balance;
    private Double withdrawLimit;

    public Account(Integer number, String holder, Double balance, Double withdrawLimit) {
        //business rules can dictate exceptions
        this.number = number;
        this.holder = holder;
        this.balance = balance;
        this.withdrawLimit = withdrawLimit;
    }

    public void deposit(Double amount) throws DepositException{
        if(amount < 0) {
            throw new DepositException("Deposit error: invalid value");
        }
        this.balance += amount;
    }

    public void withdraw(Double amount) {

        validateWithdraw(amount);
        this.balance -= amount;
    }

    private void validateWithdraw( double amount) {
        if( amount > withdrawLimit) {
            throw new WithdrawException("Withdraw error: the amount exceeds withdraw limit");
        }
        if(amount > balance) {
            throw new WithdrawException("Withdraw error: not enought balance");
        }
        if(amount < 0) {
            throw new WithdrawException("Withdraw error: invalid value");
        }
    }

    public Integer getNumber() {
        return number;
    }

    public String getHolder() {
        return holder;
    }

    public Double getBalance() {
        return balance;
    }

    public Double getWithdrawLimit() {
        return withdrawLimit;
    }

    public void setWithdrawLimit(Double withdrawLimit) {
        this.withdrawLimit = withdrawLimit;
    }

    @Override
    public String toString() {
        return "Account [number=" + number + ", holder=" + holder + ", balance=" + balance + ", withdrawLimit="
                + withdrawLimit + "]";
    }

    
}
