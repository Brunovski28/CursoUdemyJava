package exercicios._03avancado.herancaEPolimorfismo._05MetodoAbstrato.application;

import exercicios._03avancado._01trabalhadorPorHora.enums.WorkerLevel;
import exercicios._03avancado.herancaEPolimorfismo._05MetodoAbstrato.entities.Circle;
import exercicios._03avancado.herancaEPolimorfismo._05MetodoAbstrato.entities.Rectangle;
import exercicios._03avancado.herancaEPolimorfismo._05MetodoAbstrato.entities.Shape;
import exercicios._03avancado.herancaEPolimorfismo._05MetodoAbstrato.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        List<Shape> shapes = new ArrayList<>();

        System.out.println("Entre com o número de formas:");
        int numShapes = enter.nextInt();

        for (int i = 0; i < numShapes; i++) {

            System.out.println("Dados da "+(i+1)+"ª forma:");
            System.out.println("Retângulo ou círculo? (r/c)?");
            char choose = enter.next().charAt(0);

            System.out.println("Color (BLACK/BLUE/RED):");
            String color = enter.next();

            //Color.valueOf(workerLevel)
            if (choose == 'c') {

                System.out.println("Raio do círculo:");
                double radius = enter.nextDouble();

                shapes.add(new Circle(Color.valueOf(color), radius));

            } else {

                System.out.println("Altura do retângulo:");
                double height = enter.nextDouble();

                System.out.println("Largura do retângulo:");
                double width = enter.nextDouble();

                shapes.add(new Rectangle(Color.valueOf(color), width, height));

            }

        }

    }

}
