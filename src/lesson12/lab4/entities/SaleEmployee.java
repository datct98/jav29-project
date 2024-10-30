package lesson12.lab4.entities;

public class SaleEmployee extends Employee{
    public SaleEmployee(int id, String name, double salary) {
        super(id, name, salary);
    }
    private double bonus;

    public SaleEmployee(int id, String name, double salary, double bonus) {
        super(id, name, salary);
        this.bonus = bonus;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        this.bonus = bonus;
    }
}
