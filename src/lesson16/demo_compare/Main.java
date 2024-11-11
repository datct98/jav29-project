package lesson16.demo_compare;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        /*ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("DAt"));
        students.add(new Student("Huy"));
        students.add(new Student("Huệ"));
        students.add(new Student("Hoàng"));


        Map<Integer, Student> map = new HashMap<>();
        map.put(students.get(0).getId(), students.get(0));
        map.put(students.get(1).getId(), students.get(1));
        map.put(students.get(2).getId(), students.get(2));

        for (Map.Entry<Integer, Student> entry: map.entrySet()){
            System.out.println(entry.getKey()+ " "+ entry.getValue());
        }*/
        Scanner scanner = new Scanner(System.in);
        StudentService studentService = new StudentService();
        Student student = studentService.inputInfo(scanner);
        System.out.println(student);

    }
}
