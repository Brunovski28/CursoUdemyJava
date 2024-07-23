package exercicios._03avancado.herancaEPolimorfismo._01HerancaComContaDeBanco;

import exercicios._03avancado.herancaEPolimorfismo._01HerancaComContaDeBanco.entities.Account;
import exercicios._03avancado.herancaEPolimorfismo._01HerancaComContaDeBanco.entities.BusinessAccount;
import exercicios._03avancado.herancaEPolimorfismo._01HerancaComContaDeBanco.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {


        Account acc = new Account(1001, "Bruno", 0);
        BusinessAccount bacc = new BusinessAccount(1002, "Melissa", 0, 500);


        // UPCASTING
        Account acc1 = bacc;
        Account acc2 = new BusinessAccount(1003, "Camilo", 0, 200);
        Account acc3 = new SavingsAccount(1004, "Capistrano", 0, 0.01);


        // DOWNCASTING
        BusinessAccount acc4 = (BusinessAccount) acc2;
        acc4.loan(100);

        //BusinessAccount acc5 = (BusinessAccount) acc3;
        if (acc3 instanceof BusinessAccount){
            BusinessAccount acc5 = (BusinessAccount) acc3;
            acc5.loan(200);
            System.out.println("Loan!");
        }

        if (acc3 instanceof SavingsAccount){
            SavingsAccount acc5 = (SavingsAccount) acc3;
            acc5.updateBalance();
            System.out.println("Update");
        }


        // Testando a sobreposição
        Account acc6 = new Account(1005, "Mari", 1000);
        acc6.withdraw(200);
        System.out.println(acc6.getBalance());

        Account acc7 = new SavingsAccount(1006, "Emerson", 1000, 0.01);
        acc7.withdraw(200);
        System.out.println(acc7.getBalance());


        Account acc8 = new BusinessAccount(1007, "Camilo", 1000, 5000);
        acc8.withdraw(200);
        System.out.println(acc8.getBalance());


    }

}
