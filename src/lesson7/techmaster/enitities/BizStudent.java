package lesson7.techmaster.enitities;

public class BizStudent extends TechmasterStudent{
    private double marketing;
    private double sale;

    public BizStudent(String name, String major, double marketing, double sale) {
        super(name, major);
        this.marketing = marketing;
        this.sale = sale;
    }

    @Override
    public double getScore() {
        return (2*marketing + sale)/3;
    }

}
