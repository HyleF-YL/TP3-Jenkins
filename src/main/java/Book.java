import java.util.Date;

public class Book {

    protected String title;

    protected String author;

    protected Date publicationDate;


    public Book(String title, String author, Date publicationDate) {
        this.title = title;
        this.author = author;
        this.publicationDate = publicationDate;
    }
}
