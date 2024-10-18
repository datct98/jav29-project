package lesson8.lab1.service;

import lesson8.lab1.entities.Member;

import java.util.Scanner;

public class MemberService {
    public Member inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Mời b nhập công việc: ");
        String job = scanner.nextLine();
        return new Member(name, job);
    }
}
