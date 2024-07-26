package exercicios._03avancado.herancaEPolimorfismo._04Abstrato.entities;

public class BusinessAccount extends Account {

    private double loanLimit;

    public BusinessAccount(){
    }

    public BusinessAccount(Integer number, String holder, double balance, double loanLimit) {
        super(number, holder, balance); // o Super ele chama os dados da superclasse, que seria o account
        this.loanLimit = loanLimit;
    }

    public double getLoanLimit() {
        return loanLimit;
    }

    public void setLoanLimit(double loanLimit) {
        this.loanLimit = loanLimit;
    }

    public void loan(double amount){
        if (amount <= loanLimit){
            balance += amount - 10;
        }
    }

    @Override // Esse comando sobrescreve por cima o método que tem na superclasse
    public void withdraw(double amount){
        super.withdraw(amount); // usando o withdraw da superclasse
        balance -= 2;
    }

}