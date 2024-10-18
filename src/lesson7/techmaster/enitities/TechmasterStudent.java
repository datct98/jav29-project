package lesson7.techmaster.enitities;

public abstract class TechmasterStudent {
    private String name;
    private String major;

    public TechmasterStudent(String name, String major) {
        this.name = name;
        this.major = major;
    }

    public abstract double getScore();

    public String classify(){
        if(getScore()>= 7.5)
            return "HSG";
        else if (getScore() <7.5 && getScore() >6.5)
            return "HSK";

        return "HSTB";
    }
    public void printInfo(){
        System.out.println(name);
        System.out.println(major);
        System.out.println(getScore());
        System.out.println(classify());

    }
}
