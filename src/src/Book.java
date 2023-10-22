package src;


public class Book {
    private final Author author;
    private final String title;
    private int publishingYear;


    public Book(Author author, String title, int publishingYear) {
        this.author = author;
        this.title = title;
        this.publishingYear = publishingYear;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public void setPublisher(int publisher) {
        this.publishingYear = publisher;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

}


