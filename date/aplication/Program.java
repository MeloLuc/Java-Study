package date.aplication;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Program {
    
    public static void main(String[] args) {
        
        System.out.println();
        System.out.println("------DATE TEST------");

        //instantiate from now
        LocalDate d1 = LocalDate.now();
        LocalDateTime d2 = LocalDateTime.now();
        Instant d3 = Instant.now();

        //instantiate from ISO 8601
        LocalDate d4 = LocalDate.parse("2024-05-30");
        LocalDateTime d5 = LocalDateTime.parse("2024-05-30T17:33:26");
        Instant d6 = Instant.parse("2024-05-30T01:33:26Z");
        Instant d7 = Instant.parse("2024-05-30T17:33:26-03:00");

        //custom format
        LocalDate d8 = LocalDate.parse("30/05/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDateTime d9 =LocalDateTime.parse("30/05/2024 17:39", DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm"));

        System.out.println();
        System.out.println("-----------");
        System.out.println("LOCALDATE d1 = "+d1+ " (now)");
        System.out.println("LOCALDATETIME d2 = "+d2+ " (now)");
        System.out.println("INSTANT d3 = "+d3+ " (now)");
        System.out.println("LOCALDATE d4 = "+d4+ " (iso 8601)");
        System.out.println("LOCALDATETIME d5 = "+d5+ " (iso 8601)");
        System.out.println("INSTANT d6 = "+d6+ " (iso 8601)");
        System.out.println("INSTANT d7 = "+d7+ " (iso 8601)");
        System.out.println("LOCALDATE d8 = "+d8 + " (custom format)");
        System.out.println("LOCALDATETIME d9 = "+d9+ " (custom format)");
        System.out.println("-----------");

        //format data-hora -> text
        System.out.println("-FORMAT (d1-d9)");
        DateTimeFormatter format1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter format2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        DateTimeFormatter format3 = DateTimeFormatter.ISO_DATE_TIME; //LOCAL 
        DateTimeFormatter format4 = DateTimeFormatter.ISO_INSTANT; //GLOBAL

        //formats
        System.out.println(d1.format(format1));
        System.out.println(format3.format(d2));
        System.out.println(format4.format(d3));
        //System.out.println(d3.format(format1));  Instante don't work, format1
        System.out.println(d4.format(format1));
        System.out.println(d5.format(format1));
        System.out.println(format2.format(d6));
        System.out.println(format2.format(d7));
        System.out.println(d8.format(format1));
        System.out.println(d9.format(format1));
        System.out.println("-----------");

        /*for(String s : ZoneId.getAvailableZoneIds()) {
            System.out.println(s);
        }*/

        LocalDate r1 = LocalDate.ofInstant(d6, ZoneId.systemDefault());
        LocalDate r2 = LocalDate.ofInstant(d6, ZoneId.of("Portugal"));
        LocalDateTime r3 = LocalDateTime.ofInstant(d6, ZoneId.systemDefault());
        LocalDateTime r4 = LocalDateTime.ofInstant(d6, ZoneId.of("Portugal"));

        System.out.println("GLOBAL -> LOCAL");
        System.out.println(d6+ " -> "+r1+"system");
        System.out.println(d6+ " -> "+r2+"portugal");
        System.out.println(d6+ " -> "+r3+"system");
        System.out.println(d6+ " -> "+r4+"portugal");
        System.out.println("-----------");

        //duration between two date-time
        Duration t1 = Duration.between(d1.atStartOfDay(), d4.atStartOfDay());
        Duration t2 = Duration.between(d6, d7);

        LocalDate pastWeekd1 = d1.minusDays(7);
        LocalDate nextWeekd1 = d1.plusDays(7);

        LocalDateTime pastHourd2 = d2.minusHours(1);

        Instant pastWeekd3 = d3.minus(7, ChronoUnit.DAYS);


        System.out.println("duration between: "+ d1 + " e "+ d4 + " = " +t1.toDays() + " days");
        System.out.println("duration between: "+ d6 + " e "+ d7 + " = " +t2.toHours()+ " hours");
        System.out.println();

        System.out.println("d1 = " + d1);
        System.out.println("pastWeekd1 = " + pastWeekd1);
        System.out.println("nextWeekd1 = " + nextWeekd1);
        System.out.println();

        System.out.println("d2 = " + d2);
        System.out.println("pastHour d2 = "+ pastHourd2);
        System.out.println();

        System.out.println("d3 = "+ d3);
        System.out.println("pastWeek d3 = "+ pastWeekd3);
        System.out.println();
    }
}
