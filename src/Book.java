public class Book {
    private String title;
    public static int bookCount = 0;

    public Book() {
        this.title = "Unknown";
        bookCount++;
    }

    public Book(String title) {
        this.title = title;
        bookCount++;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
