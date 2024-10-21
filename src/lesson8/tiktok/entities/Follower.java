package lesson8.tiktok.entities;

public class Follower {
    private static int autoId;
    private int id;
    private String name;
    private String email;

    public Follower( String name, String email) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Follower{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
