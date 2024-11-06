package lesson15.library.entities;

import java.time.LocalDate;

public class TicketBook {
    private static int autoId;
    private int id;
    private int customerId;
    private int bookId;
    // SỐ lượng sách mượn
    private int quantity;
    private LocalDate createdDt;
    private LocalDate expiredDt;

    public TicketBook(int customerId, int bookId, int quantity, LocalDate createdDt, LocalDate expiredDt) {
        this.id = ++autoId;
        this.customerId = customerId;
        this.bookId = bookId;
        this.quantity=quantity;
        this.createdDt = createdDt;
        this.expiredDt = expiredDt;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public int getBookId() {
        return bookId;
    }

    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public LocalDate getCreatedDt() {
        return createdDt;
    }

    public void setCreatedDt(LocalDate createdDt) {
        this.createdDt = createdDt;
    }

    public LocalDate getExpiredDt() {
        return expiredDt;
    }

    public void setExpiredDt(LocalDate expiredDt) {
        this.expiredDt = expiredDt;
    }
}
