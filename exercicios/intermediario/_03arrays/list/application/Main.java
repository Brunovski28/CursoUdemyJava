package exercicios.intermediario._03arrays.list.application;

import exercicios.intermediario._03arrays.list.entities.Employee;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        List<Employee> employees = new ArrayList<>();

        System.out.println("Quantos funcionários vai ser registrado?");
        int qtdEmply = entrada.nextInt();

        for (int i = 0; i < qtdEmply; i++) {

            System.out.println("Funcionário #"+ (i + 1));

            System.out.println("ID: ");
            int id = entrada.nextInt();

            System.out.println("Nome: ");
            String name = entrada.nextLine();
            name = entrada.nextLine();

            System.out.println("Salário: ");
            double salary = entrada.nextDouble();

            Employee emp = new Employee(id, name, salary);

            employees.add(emp);

        }

        System.out.println("Entre com o id do funcionário que quer aumentar o salário");
        int id = entrada.nextInt();

        int count = 0;
        double percentage;

        for (Employee emp : employees) {

            if (emp.getId() == id) {

                System.out.println("Entre com a porcentagem");
                percentage = entrada.nextDouble();

                emp.percentage(percentage);

            } else {
                count++;
            }

        }

        if (count == qtdEmply){
           System.out.println("Esse id não existe!");
        }

        for (Employee emp : employees){
            System.out.println(emp);
        }

    }

}
