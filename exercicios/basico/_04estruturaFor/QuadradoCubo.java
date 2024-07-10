package exercicios.basico._04estruturaFor;

import java.util.Scanner;

public class QuadradoCubo {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Número?");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {

            System.out.println("|"+i+"|"+(i*i)+"|"+(i*i*i));

        }

    }

}
