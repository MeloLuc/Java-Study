package inheritanceAndPolymorphism.example.aplication;

import inheritanceAndPolymorphism.example.entities.Account;
import inheritanceAndPolymorphism.example.entities.BusinessAccount;
import inheritanceAndPolymorphism.example.entities.SavingsAccount;

public class Program {
    
   @SuppressWarnings("unused")
public static void main(String[] args) {
    
    Account Account1 = new Account(2135, "Lucas", 0.0);
    BusinessAccount busAccount1 = new BusinessAccount(4567, "Maria", 0.0, 100.0);

    //UPCASTING
    //relação "É UM" - uma subclasse A é uma super classe B
    Account account2 = busAccount1; // não dá erro
    Account account3 = new SavingsAccount(7123, "joão", 500.0, 0.5);


    //DOWNCASTING
    //BusinessAccount busAccount2 = account1; //erro incompatibilidade de tipo
    //BusinessAccount busAccount2 = (BusinessAccount)account3; //cuidado, account3 e account mas não é businessaccount, vai dar erro, Só  VOLTA PRO QUE ERA
    BusinessAccount busAccount2 = (BusinessAccount)account2;
    //Se A for intancia de B, então faz o casting de A para B
    if(account2 instanceof BusinessAccount) {
        BusinessAccount busAccount3 = (BusinessAccount)account2;
        busAccount3.loan(50);
        System.out.println("loan!");
    }
    if(account2 instanceof SavingsAccount) {
        SavingsAccount saAccount = (SavingsAccount)account2;
        saAccount.updateBalance();
        System.out.println("update!");
    }
    
    //POLYMORPHISM
    Account a = new Account(1870, "fabio", 1000.0);
    Account b = new SavingsAccount(2345, "Lucas", 1000.0, 0.2);

    a.withdraw(50);
    b.withdraw(50);

    System.out.println(a.getBalance());
    System.out.println(b.getBalance());
    //As duas variáveis são do tipo Account, porém tiveram comportamentos 
    //diferentes, comportamentos condizentes com os objetos que elas apontam no HEAP

   } 
}
