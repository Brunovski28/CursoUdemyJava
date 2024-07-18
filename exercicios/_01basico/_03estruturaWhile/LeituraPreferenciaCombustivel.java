package exercicios._01basico._03estruturaWhile;

import java.util.Scanner;

public class LeituraPreferenciaCombustivel {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int combustivel = 0;

        System.out.println("Codigo | Tipo de combustivel" +
                         "\n  1    | Alcool" +
                         "\n  2    | Gasolina " +
                         "\n  3    | Diesel" +
                         "\n  4    | Termina o programa");

        int alcool   = 0;
        int gasolina = 0;
        int diesel   = 0;

        do {

            System.out.println("Qual tipo de combustivel?");
            combustivel = entrada.nextInt();

            switch (combustivel){
                case 1:
                    alcool++;
                break;
                case 2:
                    gasolina++;
                break;
                case 3:
                    diesel++;
                break;
                case 4:
                break;
                default:
                    System.out.println("Código errado, tente novamente!");
            }

        } while (combustivel != 4);

        System.out.println("Muito obrigado!" +
                         "\nAlcool: "+alcool+
                         "\nGasolina: "+gasolina+
                         "\nDiesel: "+diesel);

    }

}
