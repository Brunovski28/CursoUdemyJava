package exercicios.intermediario._04data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class InstanciandoDatasHoras {

    // https://docs.oracle.com/javase/8/docs/api/java/time/format/DateTimeFormatter.html

    public static void main(String[] args) {

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        DateTimeFormatter fmt3 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault()); // fuso horáio do sistema local
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt5 = DateTimeFormatter.ISO_INSTANT;


        LocalDate d01 = LocalDate.now();
        LocalDateTime d02 = LocalDateTime.now();
        Instant d03 = Instant.now();

        LocalDate d04 = LocalDate.parse("2024-02-22"); // Parse 1
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T19:51:42"); // Parse 2
        Instant d06 = Instant.parse("2024-02-22T12:30:26Z"); // Parse 3
        Instant d07 = Instant.parse("2024-02-22T12:30:26-03:00"); // Parse 4

        LocalDate d08 = LocalDate.parse("22/02/2024", DateTimeFormatter.ofPattern("dd/MM/yyyy")); // Parse 5
        LocalDateTime d09 = LocalDateTime.parse("22/02/2024 20:00", fmt2); // Parse 6

        LocalDate d10 = LocalDate.of(2024, 2, 22);
        LocalDateTime d11 = LocalDateTime.of(2024, 2, 22, 20, 04);

        System.out.println("Localdate = "+d01);
        System.out.println("LocalDateTime = "+d02);
        System.out.println("Instant = "+d03);
        System.out.println("Parse 1 = "+d04);
        System.out.println("Parse 2 = "+d05);
        System.out.println("Parse 3 = "+d06);
        System.out.println("Parse 4 = "+d07);
        System.out.println("Parse 5 = "+d08);
        System.out.println("Parse 6 = "+d09);
        System.out.println("Separadamente 1 = "+d10);
        System.out.println("Separadamente 2 = "+d11);

        System.out.println("Parse 1 formatado 1° opção = "+ d04.format(fmt1));
        System.out.println("Parse 1 formatado 2° opção = "+ fmt1.format(d04));

        System.out.println("Parse 2 formatado sem horas = "+ d05.format(fmt1));
        System.out.println("Parse 2 formatado com horas = "+ d05.format(fmt2));

        System.out.println("Parse 2 formatado com horas ISO_DATE_TIME = "+ d05.format(fmt4));

        System.out.println("Parse 3 = "+fmt3.format(d06));
        System.out.println("Parse 3 formatado com horas ISO_INSTANT = "+ fmt5.format(d06));

    }

}
