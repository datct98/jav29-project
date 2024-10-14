package lesson6.bt2.service;

import lesson6.bt2.entities.Employee;

import java.util.Scanner;

public class EmployeeService {
    public Employee inputInfo(Scanner scanner){
        System.out.println("Mời b nhập ID: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Mời b nhập nơi làm việc: ");
        String placeWork = scanner.nextLine();
        System.out.println("Mời b nhập số năm kinh nghiệm: ");
        double exp = Double.parseDouble(scanner.nextLine());
        Employee employee = new Employee(id, name, address, placeWork, exp);
        return employee;

    }

    public void displayInfo(Employee employee){
        System.out.println(employee.getName());
        System.out.println(employee.getAddress());
    }
}
