package exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities;

import java.util.Date;

public final class UsedProduct extends Product{

    private Date manufactureDate;

    public UsedProduct() {
    }

    public UsedProduct(String name, double price, Date manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    public Date getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(Date manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + " (usado) $ " + getPrice() + "(Manufacture date: " + manufactureDate + ")";
    }

}
