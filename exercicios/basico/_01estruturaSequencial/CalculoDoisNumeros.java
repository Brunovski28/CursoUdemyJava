package exercicios.basico._01estruturaSequencial;

import java.util.Scanner;

public class CalculoDoisNumeros {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o 1° número:");
        int num1 = entrada.nextInt();

        System.out.println("Digite o 2° número:");
        int num2 = entrada.nextInt();

        System.out.println("Soma = "+ (num1+num2));

    }
}
