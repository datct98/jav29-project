package lesson6.bt2;

import lesson6.bt2.entities.Employee;
import lesson6.bt2.service.EmployeeService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeService eService = new EmployeeService();
        Scanner scanner = new Scanner(System.in);
        Employee employee = eService.inputInfo(scanner);
        eService.displayInfo(employee);

    }
}
