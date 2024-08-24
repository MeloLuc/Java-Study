import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

public class Programm {
    
    public static void main(String[] args) {
        
        Locale.setDefault(Locale.US);
        Scanner sc =  new Scanner(System.in);

        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("-Enter rental data-");
        System.out.print("Car model: ");
        String carModel = sc.nextLine();
        System.out.print("Pick Up (dd/MM/yyyy HH/mm): ");
        LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
        System.out.print("Deliver (dd/MM/yyyy HH/mm): ");
        LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);

        CarRental cr = new CarRental(start, finish, new Vehicle(carModel));

        System.out.print("Enter the price per hour: ");
        double pricePerHour = sc.nextDouble();
        System.out.print("Enter the price per day: ");
        double pricePerDay = sc.nextDouble();

        RentalService rentalService = new RentalService(pricePerHour, pricePerDay, new BrazilTaxService());
        rentalService.processInvoice(cr);

        System.out.println();
        System.out.println("-Invoice-");
        System.out.println("basic payment: " + cr.getInvoice().getBasicPayment());
        System.out.println("tax: " + cr.getInvoice().getTax());
        System.out.println("total payment: " + cr.getInvoice().getTotalPayment());

        sc.close();
    }
}
