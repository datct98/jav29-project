package lesson6.bt2;

import lesson6.bt2.entities.Employee;
import lesson6.bt2.service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService eService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        Employee arr [] = new Employee[n];

        for (int i = 0; i <n ; i++) {
            // Nhập thông tin cho 1 employee
            Employee employee = eService.inputInfo(scanner);
            arr[i] = employee;
        }

        for (int i = 0; i < n; i++) {
            System.out.println(arr[i]);
        }
        //eService.displayInfo(employee);

    }
}
