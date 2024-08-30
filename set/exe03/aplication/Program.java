package set.exe03.aplication;

import java.util.Set; 
import java.util.TreeSet;

import set.exe03.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        
        
        Set<Product> set = new TreeSet<>();

        set.add(new Product("TV", 900.0)); 
        set.add(new Product("Notebook", 1250.0)); 
        set.add(new Product("Tablet", 600.0)); 

        for (Product p : set) {
            System.out.println(p);
        }
    }
}
