package final_project.data;

import final_project.entities.Book;
import final_project.entities.TicketBook;

import java.util.ArrayList;
import java.util.Arrays;

public class Database {
    public static ArrayList<Book> BOOKS = new ArrayList<>(Arrays.asList(new Book(2, "Cuốn tgheo chiều gió")));
    public static ArrayList<TicketBook> TICKET_BOOKS = new ArrayList<>(Arrays.asList(new TicketBook(1, "Datct", 2)));

}
