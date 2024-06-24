package exceptions.exercise.goodSolution.aplication;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import exceptions.exercise.goodSolution.model.entities.Reservation;
import exceptions.exercise.goodSolution.model.exceptions.DomainException;


public class Program {
    // means that this method can give this type of exception
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

        try{
            System.out.print("Room Number: ");
            int roomNumber = sc.nextInt();
            System.out.print("Check-in Date (dd/MM/yyy): ");
            Date checkIn = sdf.parse(sc.next());
            System.out.print("Check-out Date (dd/MM/yyy): ");
            Date checkOut = sdf.parse(sc.next());

            
            Reservation reservation = new Reservation(roomNumber, checkIn, checkOut);
            System.out.println("Reservation: " + reservation);

            System.out.println();
            System.out.println("Enter Data to update reservation: ");
            System.out.print("Check-in Date (dd/MM/yyy): ");
            checkIn = sdf.parse(sc.next());
            System.out.print("Check-out Date (dd/MM/yyy): ");
            checkOut = sdf.parse(sc.next());

            reservation.updateDates(checkIn, checkOut);
            System.out.println("Reservation: " + reservation);
        }
        catch(ParseException e){
            System.out.println("Invalid Date Format.");
        }
        catch(DomainException e){
            e.getMessage();
        }
        catch(RuntimeException e){
            System.out.println("unexpected error");
        }

        sc.close();
    }
}

