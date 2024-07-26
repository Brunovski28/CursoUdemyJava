package exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos;

import exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities.ImportedProduct;
import exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities.Product;
import exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities.UsedProduct;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner enter = new Scanner(System.in);

        List<Product> products = new ArrayList<>();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.print("Digite o número de produtos: ");
        int numProducts = enter.nextInt();

        for (int i = 0; i < numProducts; i++) {
            System.out.println("Produto #"+ (i+1));
            System.out.print("Comum, usado ou importado (c/u/i)? ");
            char choose = enter.next().charAt(0);

            System.out.println("Nome: ");
            String productName = enter.next();

            System.out.print("Preço: ");
            double productPrice = enter.nextDouble();

            if (choose == 'c'){

                Product product = new Product(productName, productPrice);
                products.add(product);

            } else if (choose == 'u') {

                System.out.println("Data de fabricação (DD/MM/YYYY): ");
                Date manufactureDate = sdf.parse(enter.next());

                Product product = new UsedProduct(productName, productPrice, manufactureDate);
                products.add(product);

            } else if (choose == 'i') {

                System.out.println("Taxa alfandegária: ");
                double customsFee = enter.nextDouble();

                Product product = new ImportedProduct(productName, productPrice, customsFee);
                products.add(product);

            } else {
                System.out.println("Escolha errada");
            }

        }

        System.out.println("Etiquetas de preço:");

        for (int i = 0; i < products.size(); i++) {

            System.out.println(products.get(i).priceTag());

        }


    }

}
