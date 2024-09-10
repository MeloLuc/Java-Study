package functionalProgramming.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1200.0));
        list.add(new Product("Dado", 20.0));
        list.add(new Product("Caderno", 35.0));
        list.add(new Product("Moto", 14500.0));

        Collections.sort(list); //-> here the list type must contain the Comparable<> interface
        
        
        //list.sort() -> .sort is a defaul method of the Comparator<> interface, there are some ways to invoke the Comparator for the parameter.
        // a new class for the comparator
        MyComparator c = new MyComparator();
        list.sort(c);

        // an anonymous class
        Comparator<Product> c1 = new Comparator<Product>() {
            @Override
            public int compare(Product p1, Product p2) {
                return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
            }
        };
        list.sort(c1);

        // an anonymous function, arrow function, expressão lambda
        Comparator<Product> c2 = (p1,p2) -> {
            return p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());
        };

        Comparator<Product> c3 = (p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase());

        list.sort(c2);
        list.sort(c3);
        list.sort((p1,p2) -> p1.getName().toUpperCase().compareTo(p2.getName().toUpperCase()));

        for(Product p : list) {
            System.out.println(p);
        }
    }
}
