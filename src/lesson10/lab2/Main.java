package lesson10.lab2;

import lesson10.lab2.entities.Student;
import lesson10.lab2.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        ArrayList<Student> students = new ArrayList<>();
        while (true){
            Student student = studentService.inputInfo(scanner);
            students.add(student);
            System.out.println("B có muốn tiếp tục tạo không?");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N")){
                break;
            }
        }

        // Hiển thị danh sách học sinh
        studentService.printInfo(students);
        // Phân loại
        studentService.displayPercent(students);
    }
}
