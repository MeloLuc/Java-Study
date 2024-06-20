package enumeration.aplication;

import enumeration.entities.Order;
import java.util.Date;
import enumeration.entities.enums.OrderStatus;

public class Program {
    
    public static void main(String[] args) {
        
        Order order = new Order(2245, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        //String to enumeration

        OrderStatus os1 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
    }
}
