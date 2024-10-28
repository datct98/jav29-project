package lesson12.authen;

import lesson12.authen.view.Menu;

import java.util.Scanner;

public class Main {
    // Biến ở đây là biến toàn cục
    public static void main(String[] args) {
        Menu menu = new Menu();

        Scanner scanner = new Scanner(System.in);
        do {
            menu.displayMenuPreLogin(scanner);
        } while (true);

    }
}
