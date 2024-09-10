package functionalProgramming.function.aplication;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.stream.Collectors;

import functionalProgramming.function.entities.Product;
import functionalProgramming.function.util.FunctionUpperCase;


@SuppressWarnings("unused")
public class Program {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();

        list.add(new Product("TV", 1200.0));
        list.add(new Product("Dado", 20.0));
        list.add(new Product("Caderno", 35.0));
        list.add(new Product("Moto", 14500.0));

        //interface implementation
        List<String> listChanged = list.stream().map(new FunctionUpperCase()).collect(Collectors.toList());

        //reference method with static method
        listChanged = list.stream().map(Product::testStatic).collect(Collectors.toList());

        //reference method with no static method
        listChanged = list.stream().map(Product::testNoStatic).collect(Collectors.toList());

        //declared lambda expression
        Function<Product, String> function = p -> {
            return p.getName().toUpperCase();
        };
        listChanged = list.stream().map(function).collect(Collectors.toList());

        //labda expression inline
        listChanged = list.stream().map(p -> p.getName().toUpperCase()).collect(Collectors.toList());

        listChanged.forEach(System.out::println);
        
       
    }
}
