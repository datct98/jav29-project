package lesson3.while_dowhile;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String choice = "";
        int sum =0;
        /* Cách 1
        do {
            System.out.println("Mời b nhập vào số nguyên N");
            int n = Integer.parseInt(scanner.nextLine()); // n=5 4 3
            sum +=n;
            System.out.println("Do u want to continues? (Y/N)");
            choice = scanner.nextLine();
        } while (choice.equalsIgnoreCase("Y"));*/

        //System.out.println(sum);
        // chữa bài vòng lặp while
        /*while (true){
            System.out.println("Mời b nhập vào số nguyên N");
            int n = Integer.parseInt(scanner.nextLine()); // n=5 4 3
            sum +=n;
            System.out.println("Do u want to continues? (Y/N)");
            choice = scanner.nextLine();
            if(choice.equalsIgnoreCase("N")){
                break;
            }
        }
        System.out.println(sum);*/

        String choose = "";
        do {
            System.out.println("Mời b nhập tên: ");
            String name = scanner.nextLine();
            System.out.println("Mời b nhập tuổi: ");
            int age = Integer.parseInt(scanner.nextLine());
            System.out.println("Tên của bạn là: "+ name+" - tuổi: "+age);

            System.out.println("Do you want to continues?");
            choose = scanner.nextLine();
        } while (choose.equalsIgnoreCase("Y"));

    }
}