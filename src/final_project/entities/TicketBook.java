package final_project.entities;

public class TicketBook {
    private int id;
    private String username;
    private int bookId;

    public TicketBook(int id, String username, int bookId) {
        this.id = id;
        this.username = username;
        this.bookId = bookId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }
}
