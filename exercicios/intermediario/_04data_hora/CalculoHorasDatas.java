package exercicios.intermediario._04data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class CalculoHorasDatas {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-02-22"); 
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T19:51:42"); 
        Instant d06 = Instant.parse("2024-02-22T12:30:26Z"); 

        LocalDate pastWeekLocalDate = d04.minusDays(7);
        LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = "+ pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = "+ nextWeekLocalDate);        

    }

}
