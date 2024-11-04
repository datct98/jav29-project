package lesson14.student.utils;

import java.time.LocalDate;
import java.util.Scanner;

public class Utils {
    public static int inputInteger(Scanner scanner){
        do {
            try{
                int age = Integer.parseInt(scanner.nextLine());
                return age;
            } catch (NumberFormatException e){
                System.out.println("Sai định dạng, vui lòng nhập lại một số nguyên");
            }
        } while (true);
    }

    public static LocalDate inputDate(Scanner scanner){
        return null;
    }
}
