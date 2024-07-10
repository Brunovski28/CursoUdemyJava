package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class ValorMultiploOuNao {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite algum número: ");
        int num1 = entrada.nextInt();

        System.out.print("Digite algum número: ");
        int num2 = entrada.nextInt();

        if (num1 > num2) {
            if (num1 % num2 == 0){
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        } else {
            if (num2 % num1 == 0){
                System.out.println("São multiplos");
            } else {
                System.out.println("Não são multiplos");
            }
        }

    }

}
