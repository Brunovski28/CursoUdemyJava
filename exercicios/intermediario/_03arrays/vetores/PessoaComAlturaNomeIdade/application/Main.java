package exercicios.intermediario._03arrays.vetores.PessoaComAlturaNomeIdade.application;

import exercicios.intermediario._03arrays.vetores.PessoaComAlturaNomeIdade.entities.pessoa;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.println("Quantos numeros vai ser digitado?");
        int number = entrada.nextInt();

        pessoa[] vect = new pessoa[number];
        double sum = 0;

        for (int i = 0; i < vect.length; i++) {
            System.out.println("Dados da " + (i+1) + "ª pessoa:");

            System.out.println("Nome: ");
            String name = entrada.nextLine();
            name = entrada.nextLine();

            System.out.println("Idade: ");
            int age = entrada.nextInt();

            System.out.println("Altura: ");
            double height = entrada.nextDouble();

            vect[i] = new pessoa(name, age, height);

            sum += height;
        }//

        System.out.printf("Altura média: %.2f%n" , sum / vect.length);

        int count = 0;

        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAge() < 16) {
                count++;
            }

        }

        System.out.println("Pessoas com menos de 16 anos: "+ (100*count)/vect.length + "%");

        for (int i = 0; i < vect.length; i++) {

            if (vect[i].getAge() < 16) {
                System.out.println(vect[i].getName());
            }

        }

    }

}
