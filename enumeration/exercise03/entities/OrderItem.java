package enumeration.exercise03.entities;

public class OrderItem {
    
    private int quantity;
    private double price;
    private Product product;

    public OrderItem() {
    }

    public OrderItem(int quantity, Product product) {
        this.quantity = quantity;
        this.price = product.getPrice();
        this.product = product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getPrice() {
        return price;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public double subtotal() {
        return this.price * this.quantity;
    }    

}
