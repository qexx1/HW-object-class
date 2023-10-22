package src;

public class Main {
    public static void main(String[] args) {
        System.out.println("Библиотека");
        Author LevTolstoy = new Author("Lev","Tolstoy");
        Author StevenKing = new Author("Steven", "King");

        Book LevWriteBook = new Book(LevTolstoy,"War & peace |", 1865);
        LevWriteBook.setPublisher(1870);
        System.out.println(LevWriteBook.getTitle() + " " + LevWriteBook.getPublishingYear() + " " + LevWriteBook.getAuthor().getName() + " " + LevWriteBook.getAuthor().getSurname());

        Book StevenWriteBook = new Book(StevenKing, "Green Mile |", 1996);
        System.out.println(StevenWriteBook.getTitle() + " " + StevenWriteBook.getPublishingYear() + " " + StevenWriteBook.getAuthor().getName() + " " + StevenWriteBook.getAuthor().getSurname());
    }
}