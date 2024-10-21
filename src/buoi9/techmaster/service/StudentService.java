package buoi9.techmaster.service;

import buoi9.techmaster.entities.Student;

import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên học viên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập xếp loại: ");
        String classify = scanner.nextLine();
        Student duc = new Student(name, classify);
        return duc;
    }
}
