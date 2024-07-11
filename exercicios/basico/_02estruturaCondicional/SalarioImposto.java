package exercicios.basico._02estruturaCondicional;

import java.util.Scanner;

public class SalarioImposto {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Salário disponível");
        double salario = entrada.nextDouble();
        double salarioComImposto = 0;

        if (salario > 4500){
            salarioComImposto = salario - salario * 0.28;
        } else if (salario > 3000) {
            salarioComImposto = salario - salario * 0.18;
        } else if (salario > 2000) {
            salarioComImposto = salario - salario * 0.08;
        } else {
            System.out.println("Isento");
        }

        System.out.println("Salário sem imposto: "+salarioComImposto);

    }

}
