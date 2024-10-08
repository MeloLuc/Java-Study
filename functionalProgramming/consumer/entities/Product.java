package functionalProgramming.consumer.entities;

public class Product {
    
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
    public String toString() {
        return "[name=" + name + ", price=" + String.format("%.2f", price) + "]";
    }

    public static void testStatic(Product p) {
        p.setPrice(p.getPrice() * 1.1);
    }

    public void testNoStatic() {
        price = price * 1.1;
    }
    
}
