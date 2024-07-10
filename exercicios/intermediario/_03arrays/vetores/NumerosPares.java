package exercicios.intermediario._03arrays.vetores;

import java.util.Scanner;

public class NumerosPares {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado?");
        int number = entrada.nextInt();

        int[] vect = new int[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vect[i] = entrada.nextInt();
        }

        System.out.print("Números pares: ");

        int count = 0;

        for (int i = 0; i < vect.length; i++) {
            if (vect[i] % 2 == 0) {
                System.out.print(vect[i] + " ");
                count++;
            }
        }

        System.out.println("");
        System.out.println("Quantidade de pares: " + count);

    }

}
