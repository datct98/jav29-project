package lesson12.authen.view;

import lesson12.authen.entities.User;
import lesson12.authen.service.UserService;

import java.util.Scanner;

public class Menu {
    UserService userService = new UserService();
    public void displayMenuPreLogin(Scanner scanner){
        System.out.println("1 - Đăng nhập\n" +
                "\n" +
                "2 - Đăng ký\n");
        System.out.println("Mời b lựa chọn: ");
        selectMenuPreLogin(scanner);
    }

    public void displayMenuPostLogin(Scanner scanner){
        System.out.println("1 - Thay đổi username\n" +
                "\n" +
                "2 - Thay đổi email\n" +
                "\n" +
                "3 - Thay đổi mật khẩu\n" +
                "\n" +
                "4 - Đăng xuất (Sau khi đăng xuất quay về mục yêu cầu đăng nhập hoặc đăng ký)\n" +
                "\n" +
                "0 - Thoát chương trình");
        System.out.println("Mời b lựa chọn: ");
        selectMenuPreLogin(scanner);
    }

    public void selectMenuPreLogin(Scanner scanner){
        int choice = Integer.parseInt(scanner.nextLine());
        switch (choice){
            case 1:
                // Login
                System.out.println("Login");
                User user = userService.login(scanner);
                switch (user.getRole()){
                    case 1:
                        displayMenuForAdmin(scanner);
                        break;
                    case 2:
                        displayMenuForSeller(scanner);
                        break;
                    case 3:
                        displayMenuForCustomer(scanner);
                        break;
                    default:
                        System.exit(0);
                }
                break;
            case 2:
                // Register
                System.out.println("Register");
                userService.register(scanner);
                break;
        }
    }

    public void displayMenuForAdmin(Scanner scanner){
        System.out.println("Menu for admin");
    }

    public void displayMenuForCustomer(Scanner scanner){
        System.out.println("Menu for customer");
    }
    public void displayMenuForSeller(Scanner scanner){
        System.out.println("Menu for seller");
    }
}
