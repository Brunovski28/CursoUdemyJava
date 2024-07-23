package exercicios._03avancado.herancaEPolimorfismo._02funcionarios;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.print("Entre com o número de funcionários: ");
        int numEmployees = enter.nextInt();

        for (int i = 0; i < numEmployees; i++) {

            System.out.println("Funcionário #"+(i+1));
            System.out.print("Terceirizado (S/N) ? ");
            char outsourced = enter.next().charAt(0);

            System.out.println("Nome");

            if (outsourced == 'S') {



            } else {

            }

        }

    }

}
