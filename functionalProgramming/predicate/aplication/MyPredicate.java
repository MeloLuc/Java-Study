package functionalProgramming.predicate.aplication;

import java.util.function.Predicate;

import functionalProgramming.predicate.entities.Product;

public class MyPredicate implements Predicate<Product> {

    @Override
    public boolean test(Product t) {
        return t.getPrice() >= 100;
    }
    
}
