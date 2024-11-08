package lesson16.kt15p;

import lesson16.kt15p.entities.Classroom;
import lesson16.kt15p.view.Menu;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        Classroom classroom = new Classroom(new ArrayList<>());
        menu.displayMenu(scanner, classroom);
    }
}
