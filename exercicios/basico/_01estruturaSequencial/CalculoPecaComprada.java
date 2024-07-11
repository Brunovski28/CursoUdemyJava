package exercicios.basico._01estruturaSequencial;

import java.util.Scanner;

public class CalculoPecaComprada {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o código da peça 1");
        int cod1 = entrada.nextInt();

        System.out.println("Digite a quantidade da peça 1");
        int qtd1 = entrada.nextInt();

        System.out.println("Digite o valor da peça 1");
        double valor1 = entrada.nextDouble();

        System.out.println("Digite o código da peça 2");
        int cod2 = entrada.nextInt();

        System.out.println("Digite a quantidade da peça 2");
        int qtd2 = entrada.nextInt();

        System.out.println("Digite o valor da peça 2");
        double valor2 = entrada.nextDouble();

        double total = (valor1 * qtd1) + (valor1 * qtd2);

        System.out.printf("Valor a pagar: %.2f%n", total);

    }
}
