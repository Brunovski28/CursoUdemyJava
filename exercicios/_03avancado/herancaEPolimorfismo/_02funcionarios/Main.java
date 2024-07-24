package exercicios._03avancado.herancaEPolimorfismo._02funcionarios;

import exercicios._03avancado.herancaEPolimorfismo._02funcionarios.entities.Employee;
import exercicios._03avancado.herancaEPolimorfismo._02funcionarios.entities.OutsourcedEmployeed;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);
        List<Employee> employees = new ArrayList<>();

        System.out.print("Entre com o número de funcionários: ");
        int numEmployees = enter.nextInt();

        for (int i = 0; i < numEmployees; i++) {

            System.out.println("Funcionário #"+(i+1));
            System.out.print("Terceirizado (S/N) ? ");
            char outsourced = enter.next().charAt(0);

            System.out.println("Nome: ");
            String name = enter.next();

            System.out.println("Horas: ");
            int hours = enter.nextInt();

            System.out.println("Valor por hora: ");
            double valuePerHour = enter.nextDouble();

            Employee employee;

            if (outsourced == 'S') {

                System.out.println("cobrança adicional: ");
                double additionalCharge = enter.nextDouble();

                employee = new OutsourcedEmployeed(name, hours, valuePerHour, additionalCharge);

            } else {

                employee = new Employee(name, hours, valuePerHour);

            }

            employees.add(employee);

        }

        for (int i = 0; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " - $ " + employees.get(i).payment());
        }

    }

}
