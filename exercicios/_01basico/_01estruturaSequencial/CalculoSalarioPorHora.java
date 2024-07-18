package exercicios._01basico._01estruturaSequencial;

import java.util.Scanner;

public class CalculoSalarioPorHora {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Digite o número do funcionário");
        int numFuncionario = entrada.nextInt();

        System.out.println("Digite o número de horas trabalhadas do funcionário");
        int numHorasTrabalhadas = entrada.nextInt();

        System.out.println("Digite o valor que recebe por hora do funcionário");
        double salarioHora = entrada.nextDouble();

        System.out.println("Número do funcionário: "+numFuncionario);
        System.out.printf("Salário do mês: %.2f%n", (numHorasTrabalhadas * salarioHora));

    }
}
