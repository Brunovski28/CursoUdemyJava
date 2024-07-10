package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class ValorParOuImpar {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite algum número: ");
        int num = entrada.nextInt();

        if (num % 2 == 0) {
            System.out.println("Par");
        } else {
            System.out.println("Impar");
        }

    }

}
