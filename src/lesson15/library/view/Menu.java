package lesson15.library.view;

import lesson15.library.entities.Customer;
import lesson15.library.service.CustomerService;

import java.util.ArrayList;
import java.util.Scanner;

public class Menu {
    CustomerService customerService = new CustomerService();
    public void displayMenu(Scanner scanner, ArrayList<Customer> customers){
        System.out.println("=========== Menu ===========");
        System.out.println("1- Thêm mới khách hàng");
        System.out.println("2- Chỉnh sửa thông tin khách hàng");
        System.out.println("3- Xóa khách hàng");
        System.out.println("4- Thêm mới sách");
        System.out.println("5- Cập nhật thông tin sách");
        System.out.println("6- Xóa sách");
        System.out.println("Mời b lựa chọn");
        selectMenu(scanner, customers);
    }

    private void selectMenu(Scanner scanner, ArrayList<Customer> customers){
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose){
            case 1:
                customerService.insert(scanner, customers);
                break;
            case 2:
                customerService.update(scanner, customers);
                break;
            case 3:
                customerService.delete(scanner,customers);
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
        }
    }

}
