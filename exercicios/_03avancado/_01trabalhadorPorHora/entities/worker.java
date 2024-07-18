package exercicios._03avancado._01trabalhadorPorHora.entities;

import exercicios._03avancado._01trabalhadorPorHora.enums.WorkerLevel;

public class worker {

    private String name;
    private WorkerLevel worker;
    private Double baseSalary;

    public worker() {
    }

    public worker(String name, WorkerLevel worker, Double baseSalary) {
        this.name = name;
        this.worker = worker;
        this.baseSalary = baseSalary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getWorker() {
        return worker;
    }

    public void setWorker(WorkerLevel worker) {
        this.worker = worker;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public static void addContract(){

    }

}
