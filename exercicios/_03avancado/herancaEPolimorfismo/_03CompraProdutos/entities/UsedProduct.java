package exercicios._03avancado.herancaEPolimorfismo._03CompraProdutos.entities;

import java.text.SimpleDateFormat;
import java.util.Date;

public final class UsedProduct extends Product{

    private Date manufactureDate;

    SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");

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
        return getName() + " (usado) $ " + String.format("%.2f",getPrice()) + " (Data fabricado: " + sdf.format(manufactureDate) + ")";
    }

}
