package staticMember.aplication;

import java.util.Locale;
import java.util.Scanner;

import staticMember.util.Calculator;

//calculate circumference and volume
public class Program {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius:");
        double radius = sc.nextDouble();

        System.out.printf("circumference: %.2f%n", Calculator.circumference(radius));
        System.out.printf("Volume: %.2f%n", Calculator.volume(radius));
        System.out.printf("PI: %.4f%n", Calculator.PI);

        sc.close();
    }
}
