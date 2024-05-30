package vect.aplication;

import vect.entities.Product;
import java.util.Locale;
import java.util.Scanner;

public class Program {
 
    //average price
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter de size of the vector: ");
        int sizeVector = sc.nextInt();

        Product[] products = new Product[sizeVector];

        for(int i =0; i < products.length; i++) {
            System.out.printf("Enter the %d product name: ",i+1);
            sc.nextLine(); //clear
            String name = sc.nextLine();
            System.out.printf("Enter the %d product price: ",i+1);
            float price = sc.nextFloat();

            products[i] = new Product(name, price);
        }

        double sum =0;
        for (int i =0; i < products.length; i++) {
            sum += products[i].getPrice();
        }

        double average = sum / products.length;
        System.out.printf("average price %.2f%n0", average);

        sc.close();
    }
}
