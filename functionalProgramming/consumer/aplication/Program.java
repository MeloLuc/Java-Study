package functionalProgramming.consumer.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import functionalProgramming.consumer.entities.Product;
import functionalProgramming.consumer.util.PriceUpdate;

@SuppressWarnings("unused")
public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1200.0));
        list.add(new Product("Dado", 20.0));
        list.add(new Product("Caderno", 35.0));
        list.add(new Product("Moto", 14500.0));

        //interface implementation
        // list.forEach(new PriceUpdate());

        //reference method with static method
        // list.forEach(Product::testStatic);

        //reference method with no static method
        // list.forEach(Product::testNoStatic);

        //declared lambda expression
        /*
        Consumer<Product> consumer = p -> {
            p.setPrice(p.getPrice()* 1.1);
        };
        list.forEach(consumer);
        */

        //labda expression inline
        list.forEach(p -> p.setPrice(p.getPrice()*1.1));

        list.forEach(System.out::println);
       
    }
}
