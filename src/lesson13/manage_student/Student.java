package lesson13.manage_student;

public class Student implements Iclassification{
    private String name;
    private int age;
    private double marks;
    private String classification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getMarks() {
        return marks;
    }

    public void setMarks(double marks) {
        this.marks = marks;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    @Override
    public String classify() {
        if(marks>=8)
            return "A";
        else if(marks>=6.5)
            return "B";

        return "C";
    }

    @Override
    public void display() {
        System.out.println("Tên: "+name);
        System.out.println("Tuổi: "+marks);
        System.out.println("Xếp loại: "+classify());
    }
}
