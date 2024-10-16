package lesson7.travel;

import lesson7.travel.service.BusService;
import lesson7.travel.service.PlanService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mời b nhập quãng đường: ");
        double s = Double.parseDouble(scanner.nextLine());

        System.out.println("Thời gian đến nơi của máy bay là: ");
        PlanService planService = new PlanService();
        double tPlan = planService.calculateTime(s);
        System.out.println(tPlan);

        System.out.println("Thời gian đến nơi của xe bus là: ");
        BusService busService = new BusService();
        double tBus = busService.calculateTime(s);
        System.out.println(tBus);
    }
}
