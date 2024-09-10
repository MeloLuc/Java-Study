package map.exe02.aplication;

import java.util.HashMap;
import java.util.Map;

import map.exe02.entities.Product;

public class Program {
    
    public static void main(String[] args) {
        
        // product   quantity
        Map<Product , Double> cookies = new HashMap<>();

        Product p1 = new Product("TV", 900.0);
        Product p2 = new Product("Notebook", 2600.0);
        Product p3 = new Product("Tablet", 1400.0);

        cookies.put(p1, 10000.0);
        cookies.put(p2, 20000.0);
        cookies.put(p3, 15000.0);

        Product ps = new Product("TV", 900.0);

        //HashMap -> need implement methods hashcode and equal for compare
        //if you don't implement it, it will compare by pointer
        //so even if the objects are "equals", the method will return false, because it is pointing to another obeject in memory
        System.out.println("Contains 'ps' key: " + cookies.containsKey(ps));
    }
}
