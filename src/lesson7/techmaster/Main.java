package lesson7.techmaster;

import lesson7.techmaster.enitities.BizStudent;
import lesson7.techmaster.enitities.ITStudent;
import lesson7.techmaster.enitities.TechmasterStudent;
import lesson7.techmaster.service.BizStudentService;
import lesson7.techmaster.service.ITStudentService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập số lượng sv:");
        int n = Integer.parseInt(scanner.nextLine());
        TechmasterStudent [] techmasterStudents = new TechmasterStudent[n];

        BizStudentService bizStudentService = new BizStudentService();
        ITStudentService itStudentService = new ITStudentService();

        for (int i = 0; i < n; i++) {
            System.out.println("Mời b nhập sv thứ: "+(i+1));
            System.out.println("B muốn nhập thông tin cho sv: " +
                    "1-biz" +
                    "2-IT: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose){
                case 1:
                    BizStudent bizStudent = bizStudentService.inputInfo(scanner);
                    techmasterStudents[i] = bizStudent;
                    break;
                case 2:
                    ITStudent itStudent = itStudentService.inputInfo(scanner);
                    techmasterStudents[i] = itStudent;
                    break;
            }
        }
    }
}
