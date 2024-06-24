package exceptions.exercise.badSolution.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.exercise.badSolution.model.entities.Reservation;


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

        if (!checkOut.after(checkIn)) {
            System.out.println("Error in reservation: check-out date must be after check-in date.");
        } else {
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter Data to update reservation: ");
            System.out.print("Check-in Date (dd/MM/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out Date (dd/MM/yyy): ");
            checkOut = sdf.parse(sc.next());

            //delegation +-
            String error = reservation.updateDates(checkIn, checkOut);

            if(error != null) {
                System.out.println(error);
            }
            else {
                System.out.println(reservation);
            }


        }

        sc.close();
    }
}
