package exercicios._03avancado._01trabalhadorPorHora;

import exercicios._03avancado._01trabalhadorPorHora.entities.Department;
import exercicios._03avancado._01trabalhadorPorHora.entities.HoursContract;
import exercicios._03avancado._01trabalhadorPorHora.entities.Worker;
import exercicios._03avancado._01trabalhadorPorHora.enums.WorkerLevel;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class main {

    public static void main(String[] args) throws ParseException {

        Scanner enter = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

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

        Worker wrk = new Worker(name, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(department));

        for (int i = 0; i < quantityContracts; i++) {
            System.out.println("\nEntre com o #"+(i+1)+" dado do contrato");
            System.out.println("Data (DD/MM/YYYY): ");
            Date date = sdf.parse(enter.next());

            System.out.println("Valor por hora: ");
            Double valueHour = enter.nextDouble();

            System.out.println("Duração (Em horas)");
            int hours = enter.nextInt();

            HoursContract hoursContract = new HoursContract(date, valueHour, hours);
            wrk.addContract(hoursContract);

        }

        System.out.println("Entre com o mês e ano para calcular o salário (MM/YYYY): ");
        String monthAndYear = enter.next();

        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Nome: "+wrk.getName());
        System.out.println("Departamento: "+wrk.getDepartment().getName());
        System.out.println("Salário em "+ monthAndYear+ ": "+String.format("%.2f", wrk.income(year, month)));

    }

}
