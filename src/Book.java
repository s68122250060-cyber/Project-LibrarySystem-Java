public class Book {
    private String title;

    public Book(String title) {
        try {
            if (title == null || title.trim().isEmpty()) {
                throw new IllegalArgumentException("ชื่อหนังสือห้ามว่าง");
            }
            this.title = title;
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาดในการสร้าง Book: " + e.getMessage());
        }
    }

    public String getTitle() {
        return title;
    }
}