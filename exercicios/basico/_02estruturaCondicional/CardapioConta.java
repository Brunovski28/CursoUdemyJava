package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class CardapioConta {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.println("Codigo |  Especificação  |  Preço" +
                         "\n  1    | Cachorro Quente | R$ 4.00" +
                         "\n  2    | X-Salada        | R$ 4.50" +
                         "\n  3    | X-Bacon         | R$ 5.00" +
                         "\n  4    | Torrada simples | R$ 2.00" +
                         "\n  5    | Refrigerante    | R$ 1.50" );



        System.out.print("Qual lanche você quer, digite o código: ");
        int codigo = entrada.nextInt();

        System.out.print("Quantidade do lanche: ");
        int quantidade = entrada.nextInt();

        double preco = switch (codigo) {
            case 1 -> 4.00;
            case 2 -> 4.50;
            case 3 -> 5.00;
            case 4 -> 2.00;
            case 5 -> 1.50;
            default -> 1.00;
        };

        System.out.printf("Total: %.2f", preco*quantidade);
    }

}
