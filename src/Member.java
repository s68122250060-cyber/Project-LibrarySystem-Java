import java.util.Date;

public class Member {
    private String name;

    public Member(String name) {
        try {
            if (name == null || name.isEmpty()) {
                throw new IllegalArgumentException("ชื่อสมาชิกห้ามว่าง");
            }
            this.name = name;
        } catch (Exception e) {
            System.out.println("สร้าง Member ไม่สำเร็จ: " + e.getMessage());
        }
    }

    public BorrowTransaction borrow(BookCopy copy, Librarian librarian,
                                     Date borrowDate, Date dueDate) {
        try {
            return librarian.createTransaction(this, copy, borrowDate, dueDate);
        } catch (Exception e) {
            System.out.println("ยืมหนังสือไม่สำเร็จ: " + e.getMessage());
            return null;
        }
    }

    public String getName() {
        return name;
    }
}