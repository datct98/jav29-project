package lesson12.lab4.entities;

public class Leader extends Employee{
    private double salaryResp;

    public Leader(int id, String name, double salary) {
        super(id, name, salary);
    }

    public Leader(int id, String name, double salary, double salaryResp) {
        super(id, name, salary);
        this.salaryResp = salaryResp;
    }

    public double getSalaryResp() {
        return salaryResp;
    }

    public void setSalaryResp(double salaryResp) {
        this.salaryResp = salaryResp;
    }
}
