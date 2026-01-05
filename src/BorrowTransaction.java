import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BorrowTransaction {
    private Member member;
    private BookCopy copy;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;
    private Fine fine;
    public static int transactionCount = 0;

    public BorrowTransaction() {
        transactionCount++;
    }

    public BorrowTransaction(
            Member member,
            BookCopy copy,
            Date borrowDate,
            Date dueDate
    ) {
        this.member = member;
        this.copy = copy;
        this.borrowDate = borrowDate;
        this.dueDate = dueDate;
        transactionCount++;
    }

    public void returnBook(Date returnDate) {
        this.returnDate = returnDate;
        copy.giveBack();

        long diff = returnDate.getTime() - dueDate.getTime();
        long lateDays = TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);

        if (lateDays > 0) {
            fine = new Fine(lateDays * 10);
        } else {
            fine = new Fine(0);
        }
    }

    public Fine getFine() {
        return fine;
    }
}
