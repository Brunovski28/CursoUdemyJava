package exercicios._02intermediario._03arrays.vetores;

import java.util.Scanner;

public class NumeroSomaEMedia {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos números vai ser digitado?");
        int number = entrada.nextInt();

        double[] vect = new double[number];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vect[i] = entrada.nextDouble();
            sum += vect[i];
        }

        System.out.print("Valores: ");

        for (int i = 0; i < vect.length; i++) {
            System.out.print(vect[i] + " ");
        }

        System.out.println("");
        System.out.println("Soma: " + sum);
        System.out.println("Média: "+ sum / vect.length);

    }

}
