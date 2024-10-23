package lesson10.lab2.service;

import lesson10.lab2.entities.Student;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentService {
    public Student inputInfo(Scanner scanner){
        System.out.println("Mời b nhập tên hs: ");
        String name = scanner.nextLine();
        /*System.out.println("Mời b nhập tuổi hs: ");
        int age = Integer.parseInt(scanner.nextLine());*/

        System.out.println("Mời b nhập toán: ");
        double math = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập lý: ");
        double physic  = Double.parseDouble(scanner.nextLine());
        System.out.println("Mời b nhập hóa: ");
        double chemistry = Double.parseDouble(scanner.nextLine());
        return new Student(name, math, physic, chemistry);
    }

    public String classify(double math, double physic, double chemistry){
        double score = (math+physic+chemistry)/3;
        if(score>=8){
            return "A";
        } else if(score>6.5){
            return "B";
        } else {
            return "C";
        }
    }

    public void printInfo(ArrayList<Student> students){
        System.out.println("Thông tin của các học viên: ");
        for (Student student: students){
            System.out.println("Tên: "+ student.getName());
            System.out.println("Điểm toán: "+ student.getMath());
            System.out.println("Điểm lý: "+ student.getPhysic());
            System.out.println("Điểm hóa: "+ student.getChemistry());
            System.out.println("Xếp loại: "+ classify(student.getMath(),
                    student.getPhysic(), student.getChemistry()));
        }
    }

    public void displayPercent(ArrayList<Student> students){
        double countA =0, countB =0, countC=0;
        for (Student student: students){
            String classify = classify(student.getMath(),
                    student.getPhysic(), student.getChemistry());
            switch (classify){
                case "A":
                    countA++;
                    break;
                case "B":
                    countB++;
                    break;
                case "C":
                    countC++;
                    break;
            }
        }
        System.out.println("A: "+ (countA/students.size())*100 +"%");
        System.out.println("B: "+ (countB/students.size())*100 +"%");
        System.out.println("C: "+ (countC/students.size())*100 +"%");
    }
}
