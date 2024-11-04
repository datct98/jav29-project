package lesson14.demo;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.println("Mời b nhập vào một số nguyên: ");
            int n = Integer.parseInt(scanner.nextLine());
            System.out.println(n);

            int arr[] = new int[n];
            for (int i = 0; i <= n; i++) {
                System.out.println(arr[i]);
            }
        } catch (NumberFormatException formatException){
            System.out.println("Sai định dạng số nguyên, vui lòng thử lại");
        } catch (IndexOutOfBoundsException outOfBoundsException){
            System.out.println("Vượt quá kích thước mảng");
        } catch (Exception e){
            System.out.println("Sai định danghj, vui lòng thử lại");
        } finally {
            scanner.close();
        }

        // Chia tách package rõ ràng
        // Tạo 1 arraylist<Student> -> Viết hàm nhập thông tin cho học sinh: tên, tuổi, địa chỉ
        // Sau khi tạo xong hỏi có muốn tiếp tục k

    }
}
