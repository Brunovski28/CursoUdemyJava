package exercicios._03avancado._01trabalhadorPorHora.entities;

import exercicios._03avancado._01trabalhadorPorHora.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;

public class Worker {

    private String name;
    private WorkerLevel worker;
    private Double baseSalary;

    private Department department;
    private List<HoursContract> contracts = new ArrayList<>();

    public Worker() {
    }

    public Worker(String name, WorkerLevel worker, Double baseSalary, Department department) {
        this.name = name;
        this.worker = worker;
        this.baseSalary = baseSalary;
        this.department = department;
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

    public Department getDepartment() {
        return department;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HoursContract> getContracts() {
        return contracts;
    }

    public void addContract(HoursContract contract){
        contracts.add(contract);
    }

    public void removeContract(HoursContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum = baseSalary;

        for (HoursContract c : contracts){

        }

        return 1;
    }

}
