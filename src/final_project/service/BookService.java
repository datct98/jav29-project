package final_project.service;

import final_project.entities.Book;

import java.util.ArrayList;

public class BookService {
    private static BookService instance;
    private BookService() {
    }

    public static synchronized BookService getInstance() {
        if (instance == null) {
            instance = new BookService();
        }
        return instance;
    }
    public Book findById(int id, ArrayList<Book> books){
        for (Book book: books){
            if(book.getId() == id){
                return book;
            }
        }
        return null;
    }
}
