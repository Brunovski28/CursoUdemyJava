package exercicios._03avancado._03dadosDeUmPedidoNItems;

import exercicios._03avancado._03dadosDeUmPedidoNItems.entities.Client;
import exercicios._03avancado._03dadosDeUmPedidoNItems.entities.Order;
import exercicios._03avancado._03dadosDeUmPedidoNItems.entities.OrderItem;
import exercicios._03avancado._03dadosDeUmPedidoNItems.entities.Product;
import exercicios._03avancado._03dadosDeUmPedidoNItems.enums.OrderStatus;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ParseException {

        Scanner enter = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

        System.out.println("Entre com os dados do cliente:");

        System.out.println("Nome:");
        String clientName = enter.nextLine();
        clientName = enter.next();

        System.out.println("Email:");
        String clientEmail = enter.next();

        System.out.println("Data de aniversário:");
        Date birthDate = sdf.parse(enter.next());

        System.out.println("Entre com os dados dos pedidos");
        System.out.println(OrderStatus.PROCESSING);

        Client client = new Client(clientEmail, clientEmail, birthDate);
        Order order = new Order(Date.from(Instant.now()), OrderStatus.PROCESSING, client);

        System.out.println("Quantos items há para esse pedido?");
        int orderItems = enter.nextInt();

        for (int i = 0; i < orderItems; i++) {
            System.out.println("Entre com o #"+ (i+1)+ " item:");

            System.out.println("Nome do produto:");
            String productName = enter.next();

            System.out.println("Preço do produto:");
            double productPrice = enter.nextDouble();

            System.out.println("Quantidade:");
            int quantity = enter.nextInt();


            Product product = new Product(productName, productPrice);
            OrderItem orderItem = new OrderItem(quantity, productPrice, product);

            order.addItem(orderItem);

        }

        System.out.println(order);

    }

}
