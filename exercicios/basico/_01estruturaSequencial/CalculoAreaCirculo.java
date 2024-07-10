package exercicios.basico._01estruturaSequencial;

import java.util.Scanner;

public class CalculoAreaCirculo {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        double pi = Math.PI;

        System.out.println("Qual o raio do círculo?");
        double circulo = entrada.nextDouble();

        System.out.printf("Saida: %.4f%n ", pi*(circulo*circulo));

    }
}
