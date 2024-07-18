package exercicios._02intermediario._02transacoesBanco.entitites;

public class Account {

    private int numberAccount;
    private String accountHolder;
    private double valueAccount;

    public Account(int numberAccount, String accountHolder, double valueAccount) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        depositValue(valueAccount);
    }

    public Account(int numberAccount, String accountHolder){
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getValueAccount() {
        return valueAccount;
    }

    public void depositValue(double value){
        this.valueAccount += value;
    }

    public void withdrawValue(double value){
        this.valueAccount -= value + 5;
    }

    public String toString(){
        return "Dados da conta \n" +
               "Conta: " + this.numberAccount + "\n" +
               "Títular: " + this.accountHolder + "\n" +
               "Saldo: " + this.valueAccount + "\n";
    }

}
