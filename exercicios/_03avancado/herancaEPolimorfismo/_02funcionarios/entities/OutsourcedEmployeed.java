package exercicios._03avancado.herancaEPolimorfismo._02funcionarios.entities;

public class OutsourcedEmployeed extends Employee{

    private double additionalCharge;

    public OutsourcedEmployeed() {
    }

    public OutsourcedEmployeed(String name, Integer hours, double valuePerHour, double additionalCharge) {
        super(name, hours, valuePerHour);
        this.additionalCharge = additionalCharge;
    }

    public double getAdditionalCharge() {
        return additionalCharge;
    }

    public void setAdditionalCharge(double additionalCharge) {
        this.additionalCharge = additionalCharge;
    }

    @Override
    public double payment(){
        return super.payment() + (super.payment() * (additionalCharge/100));
    }

}
