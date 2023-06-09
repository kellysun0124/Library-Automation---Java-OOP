import java.util.*;

public class Books extends Collections {
    protected String ISBN;
    protected String author;
 

    //set defaults and set type to book
    public Books() {
        super();
        this.type = "Books";
        this.ISBN = "0000000000000";
        this.author = "Unknown Author";

    }

    public Books(String collectionID, String title, String ISBN) {
        this();
        this.collectionID = collectionID;
        this.title = title;
        this.ISBN = ISBN;
    }

    public Books(String collectionID, String title, String publisher, String genre, String ISBN,
            String author, String type) {
        super(collectionID, title, publisher, genre, type);
        this.type = "Books";
        this.ISBN = ISBN;
        this.author = author;
    
    }

    public String getISBN() {
        return this.ISBN;
    }

    public String getAuthor() {
        return this.author;
    }

    //make into string to be used with SaveToFile.java
    
    public String toString() {

        return String.format("%s,%s,%s,%s,%s,%s,%s\n", this.getCollectionID(), this.getISBN(), this.getTitle(), this.getPublisher(), this.getGenre(), this.getAuthor(), this.getType());

    }  
}
