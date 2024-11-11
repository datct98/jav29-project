package lesson16.demo_compare.utils;

import lesson16.demo_compare.CustomException;
import lesson16.demo_compare.Student;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Utils {
    /*public static LocalDate inputLocalDate(String dateString, String pattern){
        try {
            LocalDate birthDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(pattern));
            return birthDate;
        } catch (DateTimeParseException timeParseException){
            System.out.println("Lỗi sai định dạng thời gian, vui lòng nhập lại theo định dạng : "+pattern);
        } catch (Exception e){
            System.out.println("Lỗi: "+e);
        }
        return null;
    }*/

    public static LocalDate inputLocalDate(String dateString, String pattern) throws CustomException {
        try {
            LocalDate birthDate = LocalDate.parse(dateString, DateTimeFormatter.ofPattern(pattern));
            return birthDate;
        } catch (DateTimeParseException timeParseException){
            throw new CustomException("Lỗi sai định dạng thời gian, vui lòng nhập lại theo định dạng : "+pattern);

        } catch (Exception e){
            System.out.println("Lỗi: "+e);
        }
        return null;
    }

    public static int inputAge(Scanner scanner) throws CustomException {
        try {
            System.out.println("Mời b nhập định dạng số nguyên");
            int n = Integer.parseInt(scanner.nextLine());
            if(n < 0 || n>= 100)
                throw new CustomException("Định dạng tuổi không hợp lệ, vui lòng nhập tuổi trong khoảng (1-99)");
            return n;
        } catch (NumberFormatException numberFormatException){
            throw new NumberFormatException("Sai định dạng số nguyên");
        }

    }
}
