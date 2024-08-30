package set.exe02.aplication;

import java.util.HashSet;
import java.util.Set;

import set.exe02.entities.Product;

public class Program {
    
    public static void main(String[] args) {

        Set<Product> set = new HashSet<>();

        set.add(new Product("TV", 900.0)); 
        set.add(new Product("Notebook", 1250.0)); 
        set.add(new Product("Tablet", 600.0)); 

        Product prod = new Product("Notebook", 1250.0);

        //if the methods hashcode and equals are not implemented it compares by reference/pointer
        System.out.println(set.contains(prod));
    }
   
}
