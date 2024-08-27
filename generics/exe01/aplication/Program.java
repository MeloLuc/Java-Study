package generics.exe01.aplication;

import java.util.Scanner;

import generics.exe01.services.PrintService;

public class Program {

     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
        PrintService<String> ps = new PrintService<>(); //type safety

        System.out.print("How many values: ");
        int n = sc.nextInt();

        for (int i =0 ; i < n; i++) {
            String value = sc.next();
            ps.addValue(value);
        }

        ps.print();
        System.out.println("First: " +  ps.first());

        sc.close();
     }
}
