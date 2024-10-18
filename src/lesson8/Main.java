package lesson8;

import lesson8.lab1.entities.Family;
import lesson8.lab1.entities.Member;
import lesson8.lab1.service.FamilyService;
import lesson8.lab1.service.MemberService;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*List<String> strings = new ArrayList<>();
        ArrayList<Integer> integers = new ArrayList<>();

        strings.add("Dat");
        strings.add("Huy");
        strings.add("Dũng");
        strings.add("Huệ");
        System.out.println(strings);
        *//*strings.remove("Huệ");
        strings.remove(1);*//*
        //strings.clear();
        System.out.println(strings);

        int ar [] = new int[]{1,4,5,6};
        ArrayList<String> strings2 = new ArrayList<>(Arrays.asList("Haha", "hihi"));
        //strings2.removeAll(strings2);
        strings.addAll(strings2);
        Collections.sort(strings);
        System.out.println(strings);*/


        Scanner scanner = new Scanner(System.in);
        /*MemberService memberService = new MemberService();
        List<Member> members = new ArrayList<>();
        for (int i = 0; i < 2; i++) {
            Member member = memberService.inputInfo(scanner);
            members.add(member);
        }

        System.out.println(members);*/
        FamilyService familyService = new FamilyService();
        Family family = familyService.inputInfo(scanner);
        System.out.println(family);

    }
}
