package exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos;

import exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner enter = new Scanner(System.in);

        List<Product> products = new ArrayList<>();

        System.out.print("Digite o número de produtos:");
        int numProducts = enter.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Produto #"+ (i+1));
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char choose = enter.next().charAt(0);

            if (choose == 'c'){

            } else if (choose == 'u') {

            } else if (choose == 'i') {

            } else {
                System.out.print("Escolha errada");
            }

        }

    }

}
