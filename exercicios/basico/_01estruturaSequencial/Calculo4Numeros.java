package exercicios.basico._01estruturaSequencial;

import java.util.Scanner;

public class Calculo4Numeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1° número");
        int num1 = entrada.nextInt();

        System.out.println("Digite o 2° número");
        int num2 = entrada.nextInt();

        System.out.println("Digite o 3° número");
        int num3 = entrada.nextInt();

        System.out.println("Digite o 4° número");
        int num4 = entrada.nextInt();

        System.out.println("Diferença = "+(num1 * num2 - num3 * num4));

    }
}
