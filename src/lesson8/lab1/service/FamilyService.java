package lesson8.lab1.service;

import lesson8.lab1.entities.Family;
import lesson8.lab1.entities.Member;

import java.util.ArrayList;
import java.util.Scanner;

public class FamilyService {
    MemberService memberService = new MemberService();
    public Family inputInfo(Scanner scanner){
        ArrayList<Member> members = new ArrayList<>();
        System.out.println("Mời b nhập địa chỉ: ");
        String address = scanner.nextLine();
        while (true){
            Member member = memberService.inputInfo(scanner);
            members.add(member);
            System.out.println("B muốn nhập tiếp k? ");
            String choose = scanner.nextLine();
            if(choose.equalsIgnoreCase("N"))
                break;
        }
        return new Family(address, members);
    }
}
