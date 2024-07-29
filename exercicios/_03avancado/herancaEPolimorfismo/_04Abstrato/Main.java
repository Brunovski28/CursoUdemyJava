package exercicios._03avancado.herancaEPolimorfismo._04Abstrato;

import exercicios._03avancado.herancaEPolimorfismo._04Abstrato.entities.Account;
import exercicios._03avancado.herancaEPolimorfismo._04Abstrato.entities.BusinessAccount;
import exercicios._03avancado.herancaEPolimorfismo._04Abstrato.entities.SavingsAccount;

public class Main {

    public static void main(String[] args) {

        // Quando a classe é abstrata, não pode ser instanciada
        // Account acc1 = new Account();

        //
        Account acc2 = new BusinessAccount(1001, "Bruno", 1000, 400);
        Account acc3 = new SavingsAccount(1002, "Camilo", 500, 0.01);

    }

}
