package lesson15.library;

import lesson15.library.entities.Book;
import lesson15.library.entities.Customer;
import lesson15.library.entities.TicketBook;
import lesson15.library.view.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Customer> customers = new ArrayList<>();
        ArrayList<Book> books = new ArrayList<>();
        ArrayList<TicketBook> ticketBooks = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Menu menu = new Menu();
        do {
            menu.displayMenu(scanner, customers);
        } while (true);
    }
}
