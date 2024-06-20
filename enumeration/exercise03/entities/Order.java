package enumeration.exercise03.entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import enumeration.exercise03.entities.enums.OrderStatus;

public class Order {
    
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
    private static SimpleDateFormat sdf2 = new SimpleDateFormat("(dd/MM/yyyy)");

    private Date moment;
    private OrderStatus status;
    private Client client;

    private List<OrderItem> items = new ArrayList<>();

    public Order(){
    }

    public Order(Client client, OrderStatus status) {
        this.moment = new Date();
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient(){
        return this.client;
    }

    public List<OrderItem> getItems() {
        return this.items;
    }

    public void addItem(OrderItem item) {
        this.items.add(item);
    }

    public void removeItem(OrderItem item) {
        this.items.remove(item);
    }

    public double total() {
        double sum =0;
        for(OrderItem i : items) {
            sum += i.subtotal();
        }
        return sum;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();

        sb.append("-ORDER SUMARY-" +"\n");
        sb.append("order moment: " + sdf.format(moment) + "\n");
        sb.append("order status: " + status + "\n");
        sb.append("client: " + client.getName() +" ");
        sb.append(sdf2.format(client.getBirthDate()) + " - " + client.getEmail() + "\n");
        sb.append("order items:\n");
        for(OrderItem i : items) {
            sb.append(i.getProduct().getName() + ", " + i.getPrice() + ", ");
            sb.append("Quantity: " + i.getQuantity() + ", ");
            sb.append("Subtotal: " + i.subtotal() +"\n");
        }
        sb.append("TOTAL: " + this.total());
        return sb.toString();
    }
}
