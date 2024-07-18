package exercicios._02intermediario._03arrays.matrizes;

import java.util.Scanner;

public class LinhaPrincipalENumerosNegativos {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quanto a matriz?");
        int qtdMatriz = entrada.nextInt();

        int[][] matriz = new int[qtdMatriz][qtdMatriz];


        for (int i = 0; i < qtdMatriz; i++) {
            System.out.println("Preencha a altura "+ i);
            for (int j = 0; j < qtdMatriz; j++) {
                System.out.println("Preencha a largura "+ j);
                matriz[i][j] = entrada.nextInt();
            }
        }

        for (int i = 0; i < qtdMatriz; i++) {
            for (int j = 0; j < qtdMatriz; j++) {
                System.out.print(matriz[i][j]+ " ");
            }
            System.out.println(" ");
        }

        System.out.println("Diagonal principal");
        for (int i = 0; i < qtdMatriz; i++) {
            System.out.print(matriz[i][i] + " ");
        }

        int count = 0;

        for (int i = 0; i < qtdMatriz; i++) {
            for (int j = 0; j < qtdMatriz; j++) {
                if (matriz[i][j] < 0){
                    count++;
                }
            }
        }

        System.out.print("\nNúmeros negativos = "+count);




    }

}
