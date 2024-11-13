package final_project;

import final_project.data.Database;
import final_project.entities.TicketBook;
import final_project.service.TicketBookService;

public class Main
{
    public static void main(String[] args) {
        TicketBook ticketBook = new TicketBook(1, "datct", 2);
        TicketBookService ticketBookService = new TicketBookService();
        ticketBookService.displayInfo(Database.TICKET_BOOKS);
        System.out.println(ticketBook);
    }
}
