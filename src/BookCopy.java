public class BookCopy {
    private String copyId;
    private Book book;
    private CopyStatus status;

    public BookCopy(String copyId, Book book) {
        try {
            if (copyId == null || book == null) {
                throw new IllegalArgumentException("ข้อมูล BookCopy ไม่ถูกต้อง");
            }
            this.copyId = copyId;
            this.book = book;
            this.status = CopyStatus.AVAILABLE;
        } catch (Exception e) {
            System.out.println("สร้าง BookCopy ไม่สำเร็จ: " + e.getMessage());
        }
    }

    public void borrow() {
        try {
            if (status == CopyStatus.BORROWED) {
                throw new IllegalStateException("หนังสือถูกยืมไปแล้ว");
            }
            status = CopyStatus.BORROWED;
        } catch (Exception e) {
            System.out.println("ยืมหนังสือไม่สำเร็จ: " + e.getMessage());
        }
    }

    public void giveBack() {
        try {
            if (status == CopyStatus.AVAILABLE) {
                throw new IllegalStateException("หนังสือยังไม่ได้ถูกยืม");
            }
            status = CopyStatus.AVAILABLE;
        } catch (Exception e) {
            System.out.println("คืนหนังสือไม่สำเร็จ: " + e.getMessage());
        }
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