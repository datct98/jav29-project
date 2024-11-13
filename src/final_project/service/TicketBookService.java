package final_project.service;

import final_project.data.Database;
import final_project.entities.TicketBook;

import java.util.ArrayList;

public class TicketBookService {


    BookService bookService = BookService.getInstance();

    public void displayInfo(ArrayList<TicketBook> ticketBooks){
        for (TicketBook ticket: ticketBooks){
            System.out.println("Mã phiếu mượn: "+ticket.getId());
            System.out.println("Người mượn: "+ticket.getUsername());
            System.out.println("Thông tin sách mượn: "+bookService.findById(ticket.getBookId(), Database.BOOKS));

        }
    }
}
