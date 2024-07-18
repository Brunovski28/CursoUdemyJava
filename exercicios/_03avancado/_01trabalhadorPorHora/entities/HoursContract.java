package exercicios._03avancado._01trabalhadorPorHora.entities;

import java.util.Date;

public class HoursContract {

    private Date date;
    private Double valuePerHour;
    private int hours;

    public HoursContract() {
    }

    public HoursContract(Date date, Double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(Double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double totalValue(Double baseSalary){

        return getHours() * getValuePerHour() + baseSalary;

    }

}

