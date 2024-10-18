package lesson8.lab1.entities;

public class Member {
    private static int autoId;
    private int id;
    private String name;
    private String job;

    public Member(String name, String job) {
        this.id = ++autoId;
        this.name = name;
        this.job = job;
    }


    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", job='" + job + '\'' +
                '}';
    }
}
