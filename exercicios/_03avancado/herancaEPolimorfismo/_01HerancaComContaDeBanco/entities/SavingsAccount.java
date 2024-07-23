package exercicios._03avancado.herancaEPolimorfismo._01HerancaComContaDeBanco.entities;

// o comando FINAL, não permite que não tenha uma subclasse
public /*final*/class SavingsAccount extends Account {

    private double interestRate;

    public SavingsAccount(){
    }

    public SavingsAccount(Integer number, String holder, double balance, double interestRate) {
        super(number, holder, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }

    public void updateBalance(){
        balance += balance * interestRate;
    }

    @Override // Esse comando sobrescreve por cima o método que tem na superclasse
    // Final não permiti que as subclasses use esse método para sobrepor
    public final void withdraw(double amount){
        this.balance -= amount;
    }

}
