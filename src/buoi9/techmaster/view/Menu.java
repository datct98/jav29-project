package buoi9.techmaster.view;

import buoi9.techmaster.entities.Student;
import buoi9.techmaster.entities.Techmaster;
import buoi9.techmaster.service.StudentService;

import java.util.Scanner;

public class Menu {
    StudentService studentService = new StudentService();
    public void displayMenu(Scanner scanner, Techmaster techmaster){
        System.out.println("1- Hiển thị thông tin chi tiết của trung tâm");
        System.out.println("2- Thêm học viên");
        System.out.println("3- Cập nhật học lực");
        System.out.println("4- Xóa học viên");
        System.out.println("5- Thoát");
        System.out.println("Mời b lựa chọn");
        selectMenu(scanner, techmaster);
    }

    public void selectMenu(Scanner scanner, Techmaster techmaster){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                //TODO hiển thị thông tin của trung tâm
                System.out.println(techmaster);
                break;
            case 2:
                // Thêm học viên
                Student student = studentService.inputInfo(scanner);
                techmaster.getClassroom().getStudents().add(student);
                break;
            case 3:
                // Update student
                break;
            case 4:
                // Delete
                break;
            default:
                System.exit(0);
        }
    }
}
