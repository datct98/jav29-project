package lesson7.techmaster.enitities;

public class ITStudent extends TechmasterStudent{
    private double java;
    private double html;
    private double css;

    public ITStudent(String name, String major, double java, double html, double css) {
        super(name, major);
        this.java = java;
        this.html = html;
        this.css = css;
    }

    @Override
    public double getScore() {
        return (java +html +css)/3;
    }


}
