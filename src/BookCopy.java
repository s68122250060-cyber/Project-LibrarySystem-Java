public class BookCopy {
    private String copyId;
    private Book book;
    private CopyStatus status;
    public static int copyCount = 0;

    public BookCopy() {
        this.copyId = "UNKNOWN";
        this.book = new Book();
        this.status = CopyStatus.AVAILABLE;
        copyCount++;
    }

    public BookCopy(String copyId, Book book) {
        this.copyId = copyId;
        this.book = book;
        this.status = CopyStatus.AVAILABLE;
        copyCount++;
    }

    public void borrow() {
        status = CopyStatus.BORROWED;
    }

    public void giveBack() {
        status = CopyStatus.AVAILABLE;
    }

    public CopyStatus getStatus() {
        return status;
    }

    public String getCopyId() {
        return copyId;
    }

    public String getBookTitle() {
        return book.getTitle();
    }
}
