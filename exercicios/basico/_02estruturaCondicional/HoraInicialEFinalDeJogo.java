package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class HoraInicialEFinalDeJogo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a hora inicial do jogo: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite a hora final do jogo: ");
        int num2 = entrada.nextInt();

        if (num1 == 0 && num2 == 0){

            System.out.println("Jogo durou 24 hora(s)");

        } else if (num1 > num2) {

            int numAux = 24 - num1;
            numAux += num2;
            System.out.println("Jogo durou "+numAux+" hora(s)");

        } else {
            System.out.println("Jogo durou "+ (num2-num1) +" hora(s)");
        }

    }

}
