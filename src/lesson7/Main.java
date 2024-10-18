package lesson7;

import lesson7.demo.Chinese;
import lesson7.demo.Person;
import lesson7.demo.Vietnamese;

public class Main {
    public static void main(String[] args) {
        Chinese chinese = new Chinese();
        String chineseSay = chinese.saySomething();
        System.out.println(chineseSay);
        chinese.testPerson();
        chinese.testChinese();

        Person chinese2 = new Chinese();
        String chineseSay2 = chinese2.saySomething();
        System.out.println(chineseSay2);
        chinese2.testPerson();
        chinese2.testPerson();
    }
}
