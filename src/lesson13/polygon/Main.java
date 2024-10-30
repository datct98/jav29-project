package lesson13.polygon;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Mời b nhập chiều dài: ");
        double length = scanner.nextDouble();
        System.out.println("Mời b nhập chiều rộng: ");
        double width = scanner.nextDouble();
        Rectangle rectangle = new Rectangle(length, width);
        rectangle.display();

        //Làm nốt cho hình vuông TODO
    }
}
