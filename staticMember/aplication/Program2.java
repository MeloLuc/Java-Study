package staticMember.aplication;

import staticMember.util.CurrencyConvert;
import java.util.Locale;
import java.util.Scanner;

//buy dollar
public class Program2 {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("What is the dollar price: ");
        double priceDollar = sc.nextDouble();
        System.out.print("how many dollars will be purchased: ");
        double quantityDollar = sc.nextDouble();

        System.out.printf("Amount to be paid in reais: R$ %.2f%n",
        CurrencyConvert.convert(priceDollar, quantityDollar));

        sc.close();
    }
}
