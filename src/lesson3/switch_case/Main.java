package lesson3.switch_case;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập số nguyên a: ");
        double a = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập số nguyên b: ");
        double b = Double.parseDouble(scanner.nextLine());

        System.out.println("Mời b nhập vào phép tính: ");
        String cal = scanner.nextLine();

        switch (cal){
            case "+":
                System.out.println(a+b);
                break;
            case "-":
                System.out.println(a-b);
                break;
            case "x":
                System.out.println(a*b);
                break;
            case "/":
                System.out.println(a/b);
                break;
            case "%":
                System.out.println(a%b);
                break;
        }
    }
}
