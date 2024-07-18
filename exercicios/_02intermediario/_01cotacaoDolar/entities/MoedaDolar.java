package exercicios._02intermediario._01cotacaoDolar.entities;

public class MoedaDolar {

    public static void calc(double dolar, double qtdDolar){

        double total = (dolar * qtdDolar)*1.06  ;

        System.out.printf("Quantidade em reais que irá ser necessário: %.2f%n", total);

    }

}
