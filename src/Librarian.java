import java.util.Date;

public class Librarian {
    private String name;

    public Librarian(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("ชื่อบรรณารักษ์ห้ามว่าง");
            }
            this.name = name;
        } catch (Exception e) {
            System.out.println("สร้าง Librarian ไม่สำเร็จ: " + e.getMessage());
        }
    }

    public BorrowTransaction createTransaction(Member member, BookCopy copy,
                                               Date borrowDate, Date dueDate) {
        try {
            System.out.println("บรรณารักษ์: " + name + " ทำรายการยืม");
            return new BorrowTransaction(member, copy, borrowDate, dueDate);
        } catch (Exception e) {
            System.out.println("สร้างรายการยืมไม่สำเร็จ: " + e.getMessage());
            return null;
        }
    }
}