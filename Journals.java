import java.util.*;

public class Journals extends Collections {
    protected String ISSN;
    protected String author;

    //set defaults and set type to journal
    public Journals() {
        super();
        this.type = "Journal";
        this.ISSN = "0000000";
        this.author = "Unknown Author";
    }

    public Journals(String collectionID, String title, String ISSN) {
        this();
        this.collectionID = collectionID;
        this.title = title;
        this.ISSN = ISSN;
    }

    public Journals(String collectionID, String section, String title, String publisher, String genre, String type,
            String ISSN, String author) {
        super(collectionID, section, title, publisher, genre, type);
        this.type = "Journal";
        this.ISSN = ISSN;
        this.author = author;
    }

    public String getISSN() {
        return this.ISSN;
    }

    public String getAuthor() {
        return this.author;
    }



    //make into string to be used with SaveToFile.java
    public String toString() {
        return String.format("%s\t%s\t%s\t%s\t%s\t%s\t%s\t%s\t%2d\n", this.getCollectionID(), this.getSection(), this.getType(), this.getTitle(), this.getPublisher(), this.getGenre(), this.getISSN(), this.getAuthor());
    }
}
