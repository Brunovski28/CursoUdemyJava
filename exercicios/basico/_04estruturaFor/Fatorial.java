package exercicios.basico._04estruturaFor;

import java.util.Scanner;

public class Fatorial {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual número fatorial");
        int num = entrada.nextInt();

        int resultado = num;
        for (int i = 1; i < num; i++) {
            resultado*= i;
        }

        System.out.println("resultado: "+resultado);


    }

}
