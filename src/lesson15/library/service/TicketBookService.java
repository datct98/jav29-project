package lesson15.library.service;

import lesson15.library.entities.Book;
import lesson15.library.entities.Customer;
import lesson15.library.entities.TicketBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class TicketBookService{

    BookService bookService = new BookService();
    CustomerService customerService = new CustomerService();

    public void hireBook(Scanner scanner, ArrayList<TicketBook> objs, ArrayList<Book> books, ArrayList<Customer> customers){
        System.out.println("Mời b nhập id quyển sách muốn cho mượn: ");
        // TODO
        int idBook = Integer.parseInt(scanner.nextLine());
        Book book = bookService.findById(idBook, books);
        if(book == null){
            // K tìm thấy
            System.out.println("Không tìm thấy quyền sách có di: "+idBook);

        } else {
            System.out.println("Mời b nhập id người muốn cho mượn: ");
            // TODO
            int idCustomer = Integer.parseInt(scanner.nextLine());
            Customer customer = customerService.findById(idCustomer, customers);
            if(customer == null){
                System.out.println("K tìm thấy khách hàng trên");
            } else {
                System.out.println("Mời b nhập số lượng sách muốn cho mượn: ");
                // TODO
                int quantity = Integer.parseInt(scanner.nextLine());
                TicketBook ticketBook = new TicketBook(idCustomer, idBook,quantity, LocalDate.now(), LocalDate.now().plusDays(3));
                objs.add(ticketBook);
                // Cập nhật lại số lượng tồn kho TODO -> check số lượng tồn kho
                book.setQuantity(book.getQuantity()- quantity);
            }
        }
    }

    /*@Override
    public void insert(Scanner scanner, ArrayList<TicketBook> objs) {
        System.out.println("Mời b nhập thông tin quyển sách muốn cho mượn: ");
        int idBook = Integer.parseInt(scanner.nextLine());
        Book book = bookService.findById();
    }

    @Override
    public void update(Scanner scanner, ArrayList<TicketBook> objs) {

    }

    @Override
    public void delete(Scanner scanner, ArrayList<TicketBook> objs) {

    }*/
}
