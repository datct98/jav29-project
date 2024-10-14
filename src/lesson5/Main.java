package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student studentTechmaster = new Student();
        /*//studentTechmaster.getAge();
        studentTechmaster.setAge(123);
        studentTechmaster.setName("HUy");
        System.out.println(studentTechmaster.getName());
        System.out.println(studentTechmaster);

        Student studentFPT = new Student(18, "dat");
        studentFPT.setName("HAHA");
        System.out.println(studentFPT);
        System.out.println(Season.SPRING.name());*/

        // Tạo ra 1 class Person
        // Yêu cầu ng dùng nhập thông tin: tên, tuổi, địa chỉ
        // In ra thông tin của thằng person

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập tuổi: ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập địa chỉ: ");
        String address = scanner.nextLine();
        //C1:
        Person vietnamese = new Person();
        vietnamese.setAddress(address);
        vietnamese.setAge(age);
        vietnamese.setName(name);
        System.out.println(vietnamese);
        //C2:
        Person chinese = new Person(name, age, address);
        System.out.println(chinese);

        // Làm bài login tách hàm
        // B1: Khởi tạo sẵn một đối tượng username: techmaster pass:hoclacoviec balance: 1000
        // B2: Cho ng dùng nhập username và password -> check thông tin và hiển thị thông báo
        // B3: Sau khi login thành công -> Hiển thị menu cho người dùng lựa chọn
    }
}
