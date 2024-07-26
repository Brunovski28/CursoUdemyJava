package exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities;

public final class ImportedProduct extends Product{

    private double customsFee;

    public ImportedProduct() {
    }

    public ImportedProduct(String name, double price, double customsFee) {
        super(name, price);
        this.customsFee = customsFee;
    }

    public double getCustomsFee() {
        return customsFee;
    }

    public void setCustomsFee(double customsFee) {
        this.customsFee = customsFee;
    }

    @Override
    public String priceTag(){
        return getName() + " $ " + String.format("%.2f",totalPrice()) + " (Taxa alfandegária: $ " + String.format("%.2f",customsFee) + ")";
    }

    public double totalPrice(){
        return getPrice() + customsFee;
    }

}
