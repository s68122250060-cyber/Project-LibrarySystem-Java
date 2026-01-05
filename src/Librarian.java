import java.util.Date;

public class Librarian {
    private String name;
    public static int librarianCount = 0;

    public Librarian() {
        this.name = "Unknown";
        librarianCount++;
    }

    public Librarian(String name) {
        this.name = name;
        librarianCount++;
    }

    public BorrowTransaction createTransaction(
            Member member,
            BookCopy copy,
            Date borrowDate,
            Date dueDate
    ) {
        System.out.println("บรรณารักษ์: " + name + " ทำรายการยืม");
        return new BorrowTransaction(member, copy, borrowDate, dueDate);
    }
}
