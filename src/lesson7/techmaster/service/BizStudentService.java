package lesson7.techmaster.service;

import lesson7.techmaster.enitities.BizStudent;
import lesson7.techmaster.enitities.ITStudent;

import java.util.Scanner;

public class BizStudentService {
    public BizStudent inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = scanner.nextLine();
        System.out.println("Mời b nhập điểm marketing: ");
        double marketing = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm sale: ");
        double sale = Double.parseDouble(scanner.nextLine());

        return new BizStudent(name, major, marketing, sale );
    }
}
