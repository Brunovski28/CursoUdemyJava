package exercicios._01basico._04estruturaFor;

import java.util.Scanner;

public class ValorInEOut {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantas vezes quer digitar?");
        int num = entrada.nextInt();

        int out = 0;
        int in  = 0;

        for (int i = 0; i < num; i++) {

            System.out.println("Digite o "+ (i + 1) +"° número");
            int numInOut = entrada.nextInt();

            if (numInOut >= 10 && numInOut <= 20){
                in++;
            } else {
                out++;
            }

        }

        System.out.println(in+ " in");
        System.out.println(out+ " out");

    }

}
