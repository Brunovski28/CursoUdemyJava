package exercicios._03avancado._01trabalhadorPorHora;

import exercicios._03avancado._01trabalhadorPorHora.enums.WorkerLevel;

import java.util.Date;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        System.out.println("Entre com o nome do departamento: ");
        String department = enter.next();

        System.out.println("Entre com os dados do trabalhador:");
        System.out.println("Nome: ");
        String name = enter.next();

        System.out.println("Level: ");
        String workerLevel = enter.next();

        System.out.println("Salário base: ");
        Double baseSalary = enter.nextDouble();

        System.out.println("Quantos contratos esse trabalhador vai ter? ");
        int quantityContracts = enter.nextInt();

        int contracts[] = new int[quantityContracts];

        for (int i = 0; i < quantityContracts; i++) {
            System.out.println("\nEntre com o #"+(i+1)+" dado do contrato");
            System.out.println("Data (DD/MM/YYYY): ");
            String date = enter.next();

            System.out.println("Valor por hora: ");
            Double valueHour = enter.nextDouble();

            System.out.println("Duração (Em horas)");
            int hours = enter.nextInt();



        }


    }

}
