package lesson8.tiktok.entities;

import java.util.List;

public class Idol {
    private static int autoId;
    private int id;
    private String name;
    private String email;
    private List<Follower> followers;

    public Idol(String name, String email, List<Follower> followers) {
        this.id = ++autoId;
        this.name = name;
        this.email = email;
        this.followers = followers;
    }

    @Override
    public String toString() {
        return "Idol{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", followers=" + followers +
                '}';
    }
}
