package functionalProgramming.predicate.entities;

//to compare i can use the interface Comparable-compareTo, although if i want change the method for compare, i will need
// switch the class product -> this not is good.
// here i will use Comparator
public class Product implements Comparable<Product> {
    
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    @Override
    public int compareTo(Product o) {
        return getName().toUpperCase().compareTo(o.getName().toUpperCase());
    }

    @Override
    public String toString() {
        return "[name=" + name + ", price=" + price + "]";
    }

    public static boolean testStatic(Product p) {
        return p.getPrice() >= 100;
    }

    public boolean testNoStatic() {
        return price >= 100;
    }
    
}
