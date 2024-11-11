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
}
