package exercicios._02intermediario._04data_hora;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;

public class ConvertendoDataHoraGlobalParaLocal {

    public static void main(String[] args) {

        LocalDate d04 = LocalDate.parse("2024-02-22"); // Parse 1
        LocalDateTime d05 = LocalDateTime.parse("2024-02-22T19:51:42"); // Parse 2
        Instant d06 = Instant.parse("2024-02-22T01:30:26Z"); // Parse 3

        LocalDate R1 = LocalDate.ofInstant(d06, ZoneId.systemDefault());
        LocalDate R2 = LocalDate.ofInstant(d06, ZoneId.of("Portugal"));

        LocalDateTime R3 = LocalDateTime.ofInstant(d06, ZoneId.systemDefault());
        LocalDateTime R4 = LocalDateTime.ofInstant(d06, ZoneId.of("Portugal"));

        System.out.println("R1 = "+ R1);
        System.out.println("R2 = "+ R2);

        System.out.println("R3 = "+ R3);
        System.out.println("R4 = "+ R4);

    }

}
