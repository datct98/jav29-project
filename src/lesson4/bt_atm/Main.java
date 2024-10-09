package lesson4.bt_atm;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final String USERNAME = "techmaster";
        final String PASSWORD = "hoclacoviec";
        final double BALANCE = 1000000;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b login: ");
        System.out.println("Username: ");
        String username = scanner.nextLine();

        System.out.println("password: ");
        String password = scanner.nextLine();
        if(username.equals(USERNAME) && password.equals(PASSWORD)){
            System.out.println("Login success: ");
            System.out.println("1- Xem thông tin tài khoản");
            System.out.println("2- Rút tiền");
            System.out.println("mời b lựa chọn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case 1:
                    System.out.println("username: "+ username+" - balance: "+BALANCE);
                    break;
                case 2:
                    System.out.println("Mời b nhập số tiền muốn rút: ");
                    double money = Double.parseDouble(scanner.nextLine());
                    if(money>BALANCE){
                        System.out.println();
                    } else {

                    }
                    break;
            }
        }

    }
}
