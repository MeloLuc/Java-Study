package exceptions.exercise.badSolution.model.entities;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

public class Reservation {

    private Integer roomNumber;
    private Date checkIn;
    private Date checkOut;

    // static para que não seja intanciado um novo simpledate para cada objeto
    // reservation
    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

    public Reservation(Integer roomNumber, Date checkIn, Date checkOut) {
        this.roomNumber = roomNumber;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
    }

    public Integer getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(Integer roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Date getCheckIn() {
        return checkIn;
    }

    public Date getCheckOut() {
        return checkOut;
    }

    public long duration() {

        long diff = checkOut.getTime() - checkIn.getTime();
        // tipo enumerado complexo que tem algumas operaçoes
        return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
    }

    public String updateDates(Date checkIn, Date checkOut) {

        Date now = new Date();
        if (checkIn.before(now) || checkOut.before(now)) {
            return "Error in reservation: Reservations dates for update must be future dates.";
        }
        if (!checkOut.after(checkIn)) {
            return "Error in reservation: check-out date must be after check-in date.";
        }

        this.checkIn = checkIn;
        this.checkOut = checkOut;
        //erro-free operation
        return null;
    }

    @Override
    public String toString() {

        return "Room "
                + roomNumber
                + ",  check-in: "
                + sdf.format(checkIn)
                + ",  check-out: "
                + sdf.format(checkOut)
                + " ,"
                + this.duration() + " nights";
    }

}
