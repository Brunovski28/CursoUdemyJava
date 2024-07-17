package exercicios.intermediario._05enums.orders;

import exercicios.intermediario._05enums.orders.entities.Order;
import exercicios.intermediario._05enums.orders.enums.OrderStatus;

import java.util.Date;

public class main {

    public static void main(String[] args) {

        Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

    }

}
