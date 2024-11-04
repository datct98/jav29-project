package lesson14.student.service;

import lesson14.student.data.DataBase;
import lesson14.student.entities.Student;
import lesson14.student.utils.Utils;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {

    public void inputInfo(Scanner scanner){
        do {
            System.out.println("Mời b nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Mời b nhập tuổi");
            int age = Utils.inputInteger(scanner);
            Student student = new Student(name, age);
            DataBase.students.add(student);

            System.out.println("DO u want to continue?");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        } while (true);

    }
}
