package lesson16.kt15p.service;

import lesson16.kt15p.entities.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public ArrayList<Student> inputInfo(Scanner scanner){
        ArrayList<Student> students = new ArrayList<>();
        do {
            System.out.println("Mời b nhập tên học sinh: ");
            String name = scanner.nextLine();
            System.out.println("Mời b nhập quê quán: ");
            String country = scanner.nextLine();
            System.out.println("Mời b nhập ngày tháng năm sinh (yyyy-MM-dd)");
            String birthDate = scanner.nextLine();
            LocalDate birthDateConvert = LocalDate.parse(birthDate, DateTimeFormatter.ofPattern("yyyy-MM-dd"));
            Student student = new Student(name, country, birthDateConvert);
            students.add(student);
            System.out.println("Bạn có muốn nhập tiếp hay k?");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                return students;
        } while (true);
    }

    public ArrayList<Student> findByCountryAndBirthDate(Scanner scanner, List<Student> students){
        System.out.println("Mời b nhập tên thành phố: ");
        String country = scanner.nextLine();
        System.out.println("Mời b nhập năm sinh: ");
        int year = Integer.parseInt(scanner.nextLine());

        ArrayList<Student> studentsFound = new ArrayList<>();
        for (Student student: students){
            if(student.getCountry().equals(country) && student.getBirthDate().getYear() == year)
                studentsFound.add(student);
        }
        return studentsFound;
    }
}
