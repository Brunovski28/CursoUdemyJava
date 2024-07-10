package exercicios.intermediario._03arrays.vetores;

import java.util.Scanner;

public class NumerosAbaixoDaMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado?");
        int number = entrada.nextInt();

        double[] vect = new double[number];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vect[i] = entrada.nextDouble();
            sum += vect[i];
        }

        System.out.println("Média do vetor = " + sum / vect.length);
        System.out.println("Elementos abaixo da média");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] < (sum / vect.length)) {
                System.out.println(vect[i]);
            }

        }

    }

}
