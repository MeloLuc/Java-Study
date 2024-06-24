package inheritanceAndPolymorphism.exercise03.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import inheritanceAndPolymorphism.exercise03.entities.CompanyTaxPayer;
import inheritanceAndPolymorphism.exercise03.entities.IndividualTaxPayer;
import inheritanceAndPolymorphism.exercise03.entities.TaxPayer;

public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        List<TaxPayer> list = new ArrayList<>(); //upcasting - taxpayer é uma classe abstrata

        System.out.println();
        System.out.print("Enter the number of taxpayers: ");
        int numberTaxPayers = sc.nextInt();

        for(int i = 1; i <= numberTaxPayers; i++) {
            System.out.println();
            System.out.println("-- TAXPAYER #" +i+ " DATA --");
            System.out.print("INDIVIDUAL OR COMPANY (i|c): ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();//clear
            String name = sc.nextLine();
            System.out.print("Anual income: ");
            double anualIncome = sc.nextDouble();

            if(type == 'i'){
                System.out.print("Health expenditures: ");
                double healthExpenditures = sc.nextDouble();
                //upcasting - polymorphism
                list.add(new IndividualTaxPayer(name, anualIncome, healthExpenditures));
            }
            else {
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                //upcasting - polymorphism
                list.add(new CompanyTaxPayer(name, anualIncome, numberEmployees));
            }
        }

        System.out.println();
        System.out.println("-- TAXES PAID --");
        for(TaxPayer p : list) {
            //polymorphism
            System.out.println(p.getName()+":"+ " $"+ String.format("%.2f", p.taxPaid()));
        }

        sc.close();
    }
}
