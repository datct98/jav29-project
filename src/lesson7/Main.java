package lesson7;

import lesson7.demo.Chinese;
import lesson7.demo.Person;
import lesson7.demo.Vietnamese;

public class Main {
    public static void main(String[] args) {
        Person person = new Chinese();
        String sth= person.saySomething();
        System.out.println(sth);

        Person vn = new Vietnamese();
        String sthVn= vn.saySomething();
        System.out.println(sthVn);
    }
}
