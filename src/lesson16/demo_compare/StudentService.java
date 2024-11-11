package lesson16.demo_compare;

import lesson16.demo_compare.utils.Utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên học sinh: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập thành phố: ");
        String country = scanner.nextLine();
        do {
            try {
                System.out.println("Mời b nhập ngày tháng năm sinh (yyyy-MM-dd):");
                String birthDay = scanner.nextLine();
                LocalDate birthDate = Utils.inputLocalDate(birthDay, "yyyy-MM-dd");
                return new Student(name, country, birthDate);
            } catch (CustomException customException){
                System.out.println("Lỗi sai định dạng thời gian, vui lòng nhập lại");
            } catch (Exception e){
                System.out.println("Lỗi: "+e);
            }
        } while (true);

    }
}
