package exercicios._03avancado._03dadosDeUmPedidoNItems.entities;

import exercicios._03avancado._03dadosDeUmPedidoNItems.enums.OrderStatus;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Order {

    SimpleDateFormat sdf1 = new SimpleDateFormat("dd/mm/yyyy HH:mm:ss");
    SimpleDateFormat sdf2 = new SimpleDateFormat("dd/mm/yyyy");

    private Date moment;

    private OrderStatus status;

    private Client client;

    private List<OrderItem> orderItems = new ArrayList<>();

    public Order() {
    }

    public Order(Date moment, OrderStatus status, Client client) {
        this.moment = moment;
        this.status = status;
        this.client = client;
    }

    public Date getMoment() {
        return moment;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    public List<OrderItem> getOrderItems() {
        return orderItems;
    }

    public void addItem(OrderItem item){
        orderItems.add(item);
    }

    public void removeItem(OrderItem item){
        orderItems.remove(item);
    }

    public double total(){

        double sum = 0;

        for(OrderItem o: orderItems){
            sum += o.subTotal();
        }

        return sum;
    }

    public String toString(){
        StringBuilder sb = new StringBuilder();

        sb.append("Sumário dos pedidos:\n");
        sb.append("Momento do pedido: "+sdf1.format(moment)+"\n");
        sb.append("Status do pedido: "+status+"\n");
        sb.append("Dados do cliente: " +client.getName()+ "("+ sdf2.format(client.getBirthDate()) + ") - " + client.getEmail() + "\n");
        sb.append("Dados dos items:\n");
        for(OrderItem o: orderItems){
            sb.append(o.getProduct().getName() + ", $" + o.getProduct().getPrice() + ", Quantidade: " + o.getQuantity() + ", Subtotal: $" + o.subTotal() + "\n");
        }

        sb.append("Preço total: "+ total());

        return sb.toString();
    }

}
