package exercicios.intermediario._03arrays.vetores;

import java.util.Scanner;

public class NumerosSomas {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado em cada vetor?");
        int number = entrada.nextInt();

        int[] vectA = new int[number];
        int[] vectB = new int[number];

        for (int i = 0; i < vectA.length; i++) {
            System.out.println("Digite o número do vetor A " + (i+1) + ":");
            vectA[i] = entrada.nextInt();
        }

        for (int i = 0; i < vectB.length; i++) {
            System.out.println("Digite o número do vetor B " + (i+1) + ":");
            vectB[i] = entrada.nextInt();
        }

        System.out.println("Vetor resultante:");

        for (int i = 0; i < vectA.length; i++) {
            System.out.println(vectA[i]+vectB[i]);
        }

    }

}
