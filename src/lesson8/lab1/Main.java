package lesson8.lab1;

import lesson8.lab1.entities.Student;

public class Main {
    public static void main(String[] args) {
        Student student = new Student( "Dat", "HN");
        System.out.println(student);
        Student student2 = new Student( "Dat2", "HN");
        System.out.println(student2);
        Student student3 = new Student( "Dat2", "HN");
        System.out.println(student3);
    }
}
