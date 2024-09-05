package functionalProgramming.function.util;

import java.util.function.Function;

import functionalProgramming.function.entities.Product;

public class FunctionUpperCase implements Function<Product, String> {

    @Override
    public String apply(Product t) {
        return t.getName().toUpperCase();
    }
    
}
