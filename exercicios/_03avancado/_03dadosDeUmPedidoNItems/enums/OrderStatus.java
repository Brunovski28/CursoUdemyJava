package exercicios._03avancado._03dadosDeUmPedidoNItems.enums;

public enum OrderStatus {

    PENDING_PAYMENT(0),
    PROCESSING(1),
    SHIPPED(2),
    DELIVERED(3);

    private int choose;

    OrderStatus (int choose){
        this.choose = choose;
    }

}
