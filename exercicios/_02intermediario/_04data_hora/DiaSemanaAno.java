package exercicios._02intermediario._04data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DiaSemanaAno {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-02-22"); // Parse 1
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T19:51:42"); // Parse 2
        Instant d06 = Instant.parse("2024-02-22T12:30:26Z"); // Parse 3

        System.out.println("d04 dia = "+ d04.getDayOfMonth());
        System.out.println("d04 mês = "+ d04.getMonthValue());
        System.out.println("d04 ano = "+ d04.getYear());


        System.out.println("d05 hora = "+ d05.getHour());
        System.out.println("d05 minuto = "+ d05.getMinute());
        
        System.out.println("d05 dia = "+  d05.getDayOfMonth());
        System.out.println("d05 mês = "+  d05.getMonthValue());
        System.out.println("d05 ano = "+  d05.getYear());

        System.out.println("d06 = "+ d06);

    }

}
