package lesson3;

import java.util.Scanner;

public class NumberElectric {
    public static void main(String[] args) {
        System.out.println("Mời b nhập vào một màu sắc bất kỳ bằng tiếng anh: ");
        Scanner scanner = new Scanner(System.in);
        String color = scanner.nextLine();
        double x = 10;
        switch (color){
            case "black":
                System.out.println("Đây là màu đen");
                break;
            case "blue":
                System.out.println("Nó là màu xanh");
                break;
            case "white":
                System.out.println("Nó là màu trắng");
                break;
            default:
                System.out.println("Mù màu");
        }


    }
}
