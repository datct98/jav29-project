package lesson16.kt15p.view;

import lesson16.kt15p.entities.Classroom;
import lesson16.kt15p.entities.Student;
import lesson16.kt15p.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();

    public void displayMenu(Scanner scanner, Classroom classroom){
        System.out.println("======= Menu =======");
        System.out.println("1- Nhập thông tin học sinh");
        System.out.println("2- Tìm kiếm học sinh theo năm sinh và quê quán");
        System.out.println("3- Hiển thị danh sách học sinh");
        selectMenu(scanner, classroom);
    }

    public void selectMenu(Scanner scanner, Classroom classroom){
        // Nhớ check validate bắt exception
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                // Danh sách các học sinh chúng ta vừa thực hiện nhập
                ArrayList<Student> students = studentService.inputInfo(scanner);
                // KIểm tra danh sách học sinh trong lớp học đã được khởi tạo hay chưa
                if(classroom.getStudents()==null){
                  ArrayList<Student> studentNews = new ArrayList<>();
                  classroom.setStudents(studentNews);
                }
                classroom.getStudents().addAll(students);
                break;
            case 2:
                System.out.println(studentService.findByCountryAndBirthDate(scanner,classroom.getStudents()));
                break;
            case 3:
                break;

        }
    }
}
