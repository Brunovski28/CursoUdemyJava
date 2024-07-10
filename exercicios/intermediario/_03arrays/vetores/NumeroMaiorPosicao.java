package exercicios.intermediario._03arrays.vetores;

import java.util.Scanner;

public class NumeroMaiorPosicao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado?");
        int number = entrada.nextInt();

        int[] vect = new int[number];

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Digite o número " + (i+1) + ":");
            vect[i] = entrada.nextInt();
        }

        int highNumber = 0;
        int position = 0;

        for (int i = 0; i < vect.length; i++) {

            if (vect[i] > highNumber) {
                highNumber = vect[i];
                position = i;
            }

        }

        System.out.println("Maior valor: " + highNumber);
        System.out.println("Posição do maior valor: " + position);

    }

}
