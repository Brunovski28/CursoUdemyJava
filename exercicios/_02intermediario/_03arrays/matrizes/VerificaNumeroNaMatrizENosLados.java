package exercicios._02intermediario._03arrays.matrizes;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VerificaNumeroNaMatrizENosLados {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Integer> line = new ArrayList<>();
        List<Integer> column = new ArrayList<>();

        System.out.println("Quantas linhas?");
        int n = entrada.nextInt();

        System.out.println("Quantas colunas?");
        int m = entrada.nextInt();

        int [][] mat = new int[n][m];

        for (int i = 0; i < n; i++) {
            System.out.println("Preencha a linha "+ i);
            for (int j = 0; j < m; j++) {
                System.out.println("Preencha a coluna "+ j);
                mat[i][j] = entrada.nextInt();
            }
        }

        int count = 0;

        System.out.println("Digite um número");
        int num = entrada.nextInt();

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == num){
                    count++;
                    line.add(i);
                    column.add(j);
                }
            }
        }

        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                System.out.print(mat[i][j]+ " ");
            }
            System.out.println(" ");
        }

        for (int i = 0; i < count; i++) {
            System.out.println("Posição: "+line.get(i) + ","+ column.get(i)+ " |");

            if(line.get(i)-1 >= 0) { // Pra cima
                System.out.println("Em cima "+mat[line.get(i)-1][column.get(i)]);
            }

            if (line.get(i)+1 < n) { // Pra baixo
                System.out.println("Em baixo "+mat[line.get(i)+1][column.get(i)]);
            }

            if (column.get(i)-1 >= 0) { // Pra esquerda
                System.out.println("Pra esquerda "+mat[line.get(i)][column.get(i)-1]);
            }

            if (column.get(i)+1 < m) {
                System.out.println("Pra direita "+mat[line.get(i)][column.get(i)+1]);
            }

            System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        }


    }

}
