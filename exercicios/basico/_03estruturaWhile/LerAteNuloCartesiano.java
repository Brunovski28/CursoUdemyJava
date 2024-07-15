package exercicios.basico._03estruturaWhile;

import java.util.Scanner;

public class LerAteNuloCartesiano {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        //                              Y
        //                         Q2   |   Q1
        //                       _______|_______ X
        //                         Q3   |   Q4
        //                              |


        double eixoX = 0;
        double eixoY = 0;

    do {

        System.out.println("Eixo X (Horizontal, para direita positivo, esquerda negativo)");
        eixoX = entrada.nextDouble();

        System.out.println("Eixo Y (Vertical, para cima positivo, para baixo negativo)");
        eixoY = entrada.nextDouble();

        if (eixoX == 0 && eixoY == 0){
            System.out.println("Origem");
        } else if (eixoX >= 0 && eixoY >= 0) {
            System.out.println("Q1");
        } else if (eixoX >= 0 && eixoY <= 0) {
            System.out.println("Q4");
        } else if (eixoX <= 0 && eixoY <= 0) {
            System.out.println("Q3");
        } else if (eixoX <= 0 && eixoY >= 0) {
            System.out.println("Q2");
        }

    } while (eixoX != 0 && eixoY != 0);
    }

}
