package enumeration.exercise03.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import enumeration.exercise03.entities.Client;
import enumeration.exercise03.entities.Order;
import enumeration.exercise03.entities.OrderItem;
import enumeration.exercise03.entities.Product;
import enumeration.exercise03.entities.enums.OrderStatus;

public class Program {
 
    public static void main(String[] args) throws ParseException {
        
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner (System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        //CLIENT
        System.out.println("Enter the client data: ");
        System.out.print("Name: ");
        String clienteName = sc.nextLine();
        System.out.print("Email: ");
        String clientEmail = sc.nextLine();
        System.out.print("Birth date DD/MM/YYYY: ");
        Date clientBirthDate = sdf.parse(sc.next());
        Client client = new Client(clienteName, clientEmail, clientBirthDate);

        //ORDER
        System.out.println("Enter the order data: ");
        System.out.print("Status: ");
        String orderStatus = sc.next();
        Order order = new Order(client, OrderStatus.valueOf(orderStatus));

        //QUANTITY ORDER ITEMS
        System.out.print("how many items to this order? ");
        int quantityOrderItems = sc.nextInt();
        for(int i=0; i< quantityOrderItems; i++) {
            sc.nextLine(); //clear
            System.out.print("product name: ");
            String productName = sc.nextLine();
            System.out.print("product price: ");
            double productPrice =sc.nextDouble();
            System.out.print("product quantity: ");
            int productQuantity = sc.nextInt();
            OrderItem orderItem = new OrderItem(productQuantity, new Product(productName, productPrice));

            order.addItem(orderItem);
            System.out.println("----------");
        }
        System.out.println();
        System.out.print("----------");
        System.out.println(order);

        sc.close();
    }
}
