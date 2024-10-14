package lesson6.bt2.entities;

public class Employee extends Person{
    private String placeWork;
    private double exp;

    public Employee(int id, String name, String address, String placeWork, double exp) {
        super(id, name, address);
        this.placeWork = placeWork;
        this.exp = exp;
    }

    public String getPlaceWork() {
        return placeWork;
    }

    public void setPlaceWork(String placeWork) {
        this.placeWork = placeWork;
    }

    public double getExp() {
        return exp;
    }

    public void setExp(double exp) {
        this.exp = exp;
    }
}
