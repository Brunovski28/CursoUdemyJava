package exercicios._02intermediario._03arrays.list.entities;

public class Employee {

    private int id;
    private String name;
    private double salary;

    public Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void percentage(double percentage){
        this.salary *= (1.00 + percentage/100);
    }
    public String toString() {
        return getId() + ", " + getName() + ", " + getSalary();
    }

}
