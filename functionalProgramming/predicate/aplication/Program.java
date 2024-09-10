package functionalProgramming.predicate.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import functionalProgramming.predicate.entities.Product;

@SuppressWarnings("unused")
public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1200.0));
        list.add(new Product("Dado", 20.0));
        list.add(new Product("Caderno", 35.0));
        list.add(new Product("Moto", 14500.0));

        //interface implementation
        // MyPredicate pd = new MyPredicate();
        // list.removeIf(pd);

        //reference method with static method
        // list.removeIf(Product::testStatic);

        //reference method with no static method
        // list.removeIf(Product::testNoStatic);

        //declared lambda expression
        // Predicate<Product> pd = p -> p.getPrice() >= 100;
        // list.removeIf(pd);

        //labda expression inline
        list.removeIf(p -> p.getPrice() >= 10000);

        for(Product c : list) {
            System.out.println(c);
        }
       
    }
}
