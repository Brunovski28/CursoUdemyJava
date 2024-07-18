package exercicios._01basico._04estruturaFor;

import java.util.Scanner;

public class PossiveisDivisores {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Número?");
        int num = entrada.nextInt();

        for (int i = 1; i <= num; i++) {

            if (num % i == 0) {
                System.out.println(i);
            }

        }

    }

}
