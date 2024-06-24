package exceptions.exercise.veryBadSolution.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.exercise.veryBadSolution.model.entities.Reservation;

public class Program {
                                           // means that this method can give this type of exception
    public static void main(String[] args) throws ParseException {
        
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Room Number: ");
        int roomNumber = sc.nextInt();
        System.out.print("Check-in Date (dd/MM/yyy): ");
        Date checkIn = sdf.parse(sc.next());
        System.out.print("Check-out Date (dd/MM/yyy): ");
        Date checkOut = sdf.parse(sc.next());

        //the logic should be in the class not in the main program - delegation
        if(!checkOut.after(checkIn)){
            System.out.println("Error in reservation: check-out date must be after check-in date.");
        }
        else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter Data to update reservation: ");
            System.out.print("Check-in Date (dd/MM/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out Date (dd/MM/yyy): ");
            checkOut = sdf.parse(sc.next());

            Date now = new Date();
            if(checkIn.before(now) || checkOut.before(now)){
                System.out.println("Error in reservation: Reservations dates for update must be future dates.");
            }
            else if(!checkOut.after(checkIn)){
                System.out.println("Error in reservation: check-out date must be after check-in date.");
            }
            else {
                reservation.updateDates(checkIn, checkOut);
                System.out.println(reservation);  
            }

            
        }


        sc.close();
    }
}
