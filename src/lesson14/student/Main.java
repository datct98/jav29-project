package lesson14.student;

import lesson14.student.data.DataBase;
import lesson14.student.entities.Student;
import lesson14.student.service.StudentService;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        studentService.inputInfo(scanner);
        System.out.println(DataBase.students);
    }
}
