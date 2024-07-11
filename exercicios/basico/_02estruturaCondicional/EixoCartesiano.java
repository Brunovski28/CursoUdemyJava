package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class EixoCartesiano {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        
        //                              Y
        //                         Q2   |   Q1
        //                       _______|_______ X
        //                         Q3   |   Q4
        //                              |
        //

        System.out.println("Eixo X (Horizontal, para direita positivo, esquerda negativo)");
        double eixoX = entrada.nextDouble();

        System.out.println("Eixo Y (Vertical, para cima positivo, para baixo negativo)");
        double eixoY = entrada.nextDouble();

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


    }

}
