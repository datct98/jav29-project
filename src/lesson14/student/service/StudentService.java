package lesson14.student.service;

import lesson14.student.data.DataBase;
import lesson14.student.entities.Student;
import lesson14.student.exception.InvalidAgeException;
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

            try {
                checkValidAge(age);
            } catch (InvalidAgeException e) {
                System.out.println(e.getMessage());
                continue;
            }
            Student student = new Student(name, age);
            DataBase.students.add(student);

            System.out.println("DO u want to continue?");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        } while (true);

    }

    private void checkValidAge(int age) throws InvalidAgeException {
        if(age<0 || age >99)
            throw new InvalidAgeException("Tuổi phải nằm trong khoảng từ 1 - 99");
    }
}
