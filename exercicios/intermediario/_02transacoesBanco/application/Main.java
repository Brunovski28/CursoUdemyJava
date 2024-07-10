package exercicios.intermediario._02transacoesBanco.application;

import exercicios.intermediario._02transacoesBanco.entitites.Account;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);
        Account account;


        System.out.println("Digite o número da conta");
        int numberAccount = entrada.nextInt();

        System.out.println("Digite o títular da conta");
        String accountHolder = entrada.nextLine();
        accountHolder = entrada.nextLine();

        System.out.println("Tem deposito disponível? (S/N)");
        char choose = entrada.next().charAt(0);

        if (choose == 'S' || choose == 's') {

            System.out.println("Entre com o valor inicial para deposito!");
            double initialValue = entrada.nextDouble();

            account = new Account(numberAccount, accountHolder, initialValue);

        } else {

            account = new Account(numberAccount, accountHolder);

        }

        System.out.println(account.toString());

        System.out.println("Entre com um valor para deposito!");
        double newValue = entrada.nextDouble();

        account.depositValue(newValue);

        System.out.println("Conta atualizada");
        System.out.println(account.toString());

        System.out.println("Entre com um valor para resgatar");
        double withdrawValue = entrada.nextDouble();

        account.withdrawValue(withdrawValue);

        System.out.println("Conta atualizada");
        System.out.println(account.toString());

        entrada.close();

    }

}
