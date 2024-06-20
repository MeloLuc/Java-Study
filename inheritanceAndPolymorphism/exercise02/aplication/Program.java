package inheritanceAndPolymorphism.exercise02.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.Date;

import inheritanceAndPolymorphism.exercise02.entities.*;

public class Program {
    
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        List<Product> list = new ArrayList<>(); //upcastin-polymorphism

        System.out.println();
        System.out.print("ENTER THE NUMBER OF PRODUCTS: ");
        int numberProducts = sc.nextInt();

        for( int i = 1; i<= numberProducts; i++){
            System.out.println();
            System.out.println("PRODUCT #" +i + " DATA:");
            System.out.print("Common, Used or Imported (c|u|i)? ");
            char type = sc.next().charAt(0);
            sc.nextLine(); //clear
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Price: ");
            //here a can use float too- memory - casting, but only for learn(inherit-poly...) i will use double(more easier) 
            double price = sc.nextDouble();

            if(type == 'c') {
                Product product = new Product(name, price);
                list.add(product);
            }
            else if(type == 'u'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(sc.next());
                Product product = new UsedProduct(name, price, manufactureDate);
                list.add(product);
            }
            else {
                System.out.print("Customs fee: ");
                double fee = sc.nextDouble();
                Product product = new ImportedProduct(name, price, fee);
                list.add(product);
            }
        }
        
        System.out.println();
        System.out.println("-- PRICE TAGS --");
        for(Product p : list) {
            System.out.println(p.priceTag()); //polymorphism
        }

        sc.close();
    }
}
