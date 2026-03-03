import java.util.Date;
import java.util.concurrent.TimeUnit;

public class BorrowTransaction {
    private Member member;
    private BookCopy copy;
    private Fine fine;
    private Date borrowDate;
    private Date dueDate;
    private Date returnDate;

    public BorrowTransaction(Member member, BookCopy copy, Date borrowDate, Date dueDate) {
        try {
            if (borrowDate.after(dueDate)) {
                throw new IllegalArgumentException("วันกำหนดคืนต้องมากกว่าวันยืม");
            }
            this.member = member;
            this.copy = copy;
            this.borrowDate = borrowDate;
            this.dueDate = dueDate;
            copy.borrow();
        } catch (Exception e) {
            System.out.println("สร้างรายการยืมไม่สำเร็จ: " + e.getMessage());
        }
    }

    public void returnBook(Date returnDate) {
        try {
            if (returnDate.before(borrowDate)) {
                throw new IllegalArgumentException("วันที่คืนไม่ถูกต้อง");
            }

            this.returnDate = returnDate;
            copy.giveBack();

            if (returnDate.after(dueDate)) {
                long diffInMillies = returnDate.getTime() - dueDate.getTime();
                long diffInDays = TimeUnit.DAYS.convert(diffInMillies, TimeUnit.MILLISECONDS);
                fine = new Fine(diffInDays * 10);
            } else {
                fine = new Fine(0);
            }

        } catch (Exception e) {
            System.out.println("คืนหนังสือไม่สำเร็จ: " + e.getMessage());
        }
    }

    public Fine getFine() {
        return fine;
    }
}