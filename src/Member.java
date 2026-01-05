import java.util.Date;

public class Member {
    private String name;
    public static int memberCount = 0;

    public Member() {
        this.name = "Guest";
        memberCount++;
    }

    public Member(String name) {
        this.name = name;
        memberCount++;
    }

    public BorrowTransaction borrow(
            BookCopy copy,
            Librarian librarian,
            Date borrowDate,
            Date dueDate
    ) {
        copy.borrow();
        return librarian.createTransaction(this, copy, borrowDate, dueDate);
    }

    public String getName() {
        return name;
    }
}
