package lesson13.news;

public class News implements INews{
    private String title;
    private String author;
    private String publicDate;

    public News(String title, String author, String publicDate) {
        this.title = title;
        this.author = author;
        this.publicDate = publicDate;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPublicDate() {
        return publicDate;
    }

    public void setPublicDate(String publicDate) {
        this.publicDate = publicDate;
    }

    @Override
    public void display() {
        System.out.println("Title: "+title+"\n"+
                "Author: "+author+"\n"+
                "PublicDate: "+publicDate);
    }
}
