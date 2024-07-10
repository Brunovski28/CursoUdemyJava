package exercicios.intermediario._01cotacaoDolar;

import exercicios.intermediario._01cotacaoDolar.entities.MoedaDolar;

import java.util.Scanner;

public class main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Qual é o preço do dolar?");
        double dolar = entrada.nextDouble();

        System.out.println("Quantos dolars você quer comprar?");
        double qtdDolar = entrada.nextDouble();

        MoedaDolar.calc(dolar, qtdDolar);

    }

}
