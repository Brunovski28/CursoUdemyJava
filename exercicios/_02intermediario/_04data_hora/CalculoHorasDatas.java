package exercicios._02intermediario._04data_hora;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class CalculoHorasDatas {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-02-22"); 
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T19:51:42"); 
        Instant d06 = Instant.parse("2024-02-22T12:30:26Z"); 


        // LocalDate
        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);


        // LocalDateTime
        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = "+ pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDateTime = "+ nextWeekLocalDateTime);


        // Instant
        Instant pastWeekLocalInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekLocalInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekLocalInstant = "+ pastWeekLocalInstant);
        System.out.println("nextWeekLocalInstant = "+ nextWeekLocalInstant);


        // Duration
        Duration t1 = Duration.between(pastWeekLocalDateTime, d05);

        // o LocalDate tem que ser transformado para um LocalDateTime
        Duration t2 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atStartOfDay());
        Duration t3 = Duration.between(pastWeekLocalInstant, d06);
        Duration t4 = Duration.between(d06, pastWeekLocalInstant);

        System.out.println("t1 dias = "+t1.toDays());
        System.out.println("T2 dias = "+t2.toDays());
        System.out.println("T3 dias = "+t3.toDays());
        System.out.println("T4 dias = "+t4.toDays());


    }

}
