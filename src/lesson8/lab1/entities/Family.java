package lesson8.lab1.entities;

import java.util.List;

public class Family {
    private String address;
    private List<Member> members;

    public Family(String address, List<Member> members) {
        this.address = address;
        this.members = members;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public List<Member> getMembers() {
        return members;
    }

    public void setMembers(List<Member> members) {
        this.members = members;
    }

    @Override
    public String toString() {
        return "Family{" +
                "address='" + address + '\'' +
                ", members=" + members +
                '}';
    }
}
