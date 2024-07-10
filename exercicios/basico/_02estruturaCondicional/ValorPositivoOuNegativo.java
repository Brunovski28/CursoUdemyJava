package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class ValorPositivoOuNegativo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite algum número: ");
        int num = entrada.nextInt();

        if (num >= 0) {
            System.out.println("Valor positivo");
        } else {
            System.out.println("Valor negativo");
        }


    }

}
