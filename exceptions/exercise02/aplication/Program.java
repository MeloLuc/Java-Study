package exceptions.exercise02.aplication;

import java.util.Locale;
import java.util.Scanner;

import exceptions.exercise02.model.entities.Account;
import exceptions.exercise02.model.exceptions.DepositException;
import exceptions.exercise02.model.exceptions.WithdrawException;;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        try{
            System.out.println();
            System.out.println("-- Enter Account Data --");
            System.out.print("Holder: ");
            String holder = sc.nextLine(); //can give me exception
            System.out.print("Number: ");
            int number = sc.nextInt();     //can give me exception
            System.out.print("Balance: ");
            double balance = sc.nextDouble(); //can give me exception
            System.out.print("Withdraw Limit: ");
            double withdrawLimit = sc.nextDouble(); //can give me exception

            Account accountTest = new Account(number, holder, balance, withdrawLimit);

            System.out.println();
            System.out.println("-- Account created --");
            System.out.println(accountTest);
            System.out.println();

            System.out.print("Enter amount for deposit: ");
            double deposit = sc.nextDouble(); //can give me exception
            accountTest.deposit(deposit); //can give me exception
            System.out.println("new balance = "+ String.format("%.2f", accountTest.getBalance()));
            System.out.println();

            System.out.print("Enter amount for withdraw: ");
            double withdraw = sc.nextDouble(); //can give me exception
            accountTest.withdraw(withdraw); //can give me exception
            System.out.println("new balance = "+ String.format("%.2f", accountTest.getBalance()));

            System.out.println();
            System.out.println(accountTest);

        } //exceptions created
        catch(DepositException e){
            System.out.println(e.getMessage());
        }
        catch(WithdrawException e) {
            System.out.println(e.getMessage());
        }
        catch(RuntimeException e) {
            System.out.println("Unexpected Error!");
        }

        sc.close();
    }
}
