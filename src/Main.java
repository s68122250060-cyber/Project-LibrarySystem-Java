import java.util.Scanner;
import java.util.Date;
import java.text.SimpleDateFormat;
import java.text.ParseException;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        sdf.setLenient(false); // ป้องกันวันที่ผิด เช่น 2024-02-30

        try {
            // สร้างข้อมูล
            Book book = new Book("Java Programming");
            BookCopy copy = new BookCopy("C001", book);
            Member member = new Member("Alice");
            Librarian librarian = new Librarian("Bob");

            // รับวันที่ยืม
            System.out.print("กรอกวันที่ยืม (yyyy-MM-dd): ");
            Date borrowDate = sdf.parse(sc.nextLine());

            // รับวันที่กำหนดคืน
            System.out.print("กรอกวันที่กำหนดคืน (yyyy-MM-dd): ");
            Date dueDate = sdf.parse(sc.nextLine());

            // ยืมหนังสือ
            BorrowTransaction tx =
                    member.borrow(copy, librarian, borrowDate, dueDate);

            // รับวันที่คืน
            System.out.print("กรอกวันที่คืน (yyyy-MM-dd): ");
            Date returnDate = sdf.parse(sc.nextLine());

            // คืนหนังสือ
            tx.returnBook(returnDate);

            // แสดงผล
            System.out.println("สถานะหนังสือ: " + copy.getStatus());
            System.out.println("ค่าปรับ: " + tx.getFine().getAmount() + " บาท");

        } catch (ParseException e) {
            System.out.println("รูปแบบวันที่ไม่ถูกต้อง! กรุณากรอกเป็น yyyy-MM-dd");
        } catch (Exception e) {
            System.out.println("เกิดข้อผิดพลาด: " + e.getMessage());
        } finally {
            sc.close();
            System.out.println("จบการทำงานของโปรแกรม");
        }
    }
}