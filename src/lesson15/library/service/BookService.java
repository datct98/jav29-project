package lesson15.library.service;

import lesson15.library.entities.Book;
import lesson15.library.entities.Customer;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BookService implements ActionService<Book>{

    public Book findById(int id, ArrayList<Book> books ){
        for (Book book: books){
            if(book.getId() == id){
                // Tìm thấy
                return book;
            }
        }
        return null;
    }

    @Override
    public void insert(Scanner scanner, ArrayList<Book> objs) {
        System.out.println("Mời  nhập tên sách: ");
        String name = scanner.nextLine();
        System.out.println("Mời  nhập trạng thái: ");
        String status = scanner.nextLine();
        System.out.println("Mời  nhập số lượng: ");
        int quantity  = Integer.parseInt(scanner.nextLine());
        Book book = new Book(name, status, quantity);

        objs.add(book);
    }

    @Override
    public void update(Scanner scanner, ArrayList<Book> objs) {

    }

    @Override
    public void delete(Scanner scanner, ArrayList<Book> objs) {

    }
}
