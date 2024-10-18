package lesson7.techmaster.service;

import lesson7.techmaster.enitities.ITStudent;

import java.util.Scanner;

public class ITStudentService {
    public ITStudent inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập chuyên ngành: ");
        String major = scanner.nextLine();
        System.out.println("Mời b nhập điểm html: ");
        double html = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm css: ");
        double css = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập điểm java: ");
        double java = Double.parseDouble(scanner.nextLine());
        return new ITStudent(name, major, java, html, css);
    }
}
