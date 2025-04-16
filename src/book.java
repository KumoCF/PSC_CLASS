public class Book {
    public String title;
    public String author;
    public int numPages;

    public Book(String title, String author, int numPages) {
        this.title = title;
        this.author = author;
        this.numPages = numPages;
    }

    public void displayInformation() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
        System.out.println("Number of Pages: " + this.numPages);
    }
}