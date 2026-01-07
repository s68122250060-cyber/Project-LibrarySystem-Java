# ตารางสรุป Class, Attribute และ Method (ข้อ 5)
**Object-Oriented Programming (OOP)** โดยสรุป Class, Attribute และ Method ของแต่ละคลาส

---

## 1.Class: Book

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| title | String | private | ชื่อหนังสือ |
| bookCount | int | public static | นับจำนวนหนังสือทั้งหมด |

### Method
| Method | คำอธิบาย |
|---|---|
| Book() | constructor เริ่มต้น |
| Book(String title) | constructor กำหนดชื่อหนังสือ |
| getTitle() | คืนค่าชื่อหนังสือ |
| setTitle(String title) | ตั้งค่าชื่อหนังสือ |

---

## 2.Class: BookCopy

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| copyId | String | private | รหัสสำเนาหนังสือ |
| book | Book | private | หนังสือที่อ้างอิง |
| status | CopyStatus | private | สถานะการยืม |
| copyCount | int | public static | นับจำนวนสำเนาหนังสือ |

### Method
| Method | คำอธิบาย |
|---|---|
| BookCopy() | constructor เริ่มต้น |
| BookCopy(String, Book) | constructor กำหนดรหัสและหนังสือ |
| borrow() | เปลี่ยนสถานะเป็นยืม |
| giveBack() | เปลี่ยนสถานะเป็นว่าง |
| getCopyId() | คืนค่ารหัสสำเนา |
| setCopyId(String) | ตั้งค่ารหัสสำเนา |
| getStatus() | คืนค่าสถานะ |
| setStatus(CopyStatus) | ตั้งค่าสถานะ |
| getBookTitle() | คืนค่าชื่อหนังสือ |

---

## 3.Class: Member

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| name | String | private | ชื่อสมาชิก |
| memberCount | int | public static | นับจำนวนสมาชิก |

### Method
| Method | คำอธิบาย |
|---|---|
| Member() | constructor เริ่มต้น |
| Member(String name) | constructor กำหนดชื่อสมาชิก |
| borrow(BookCopy, Librarian, Date, Date) | ยืมหนังสือ |
| getName() | คืนค่าชื่อสมาชิก |
| setName(String) | ตั้งค่าชื่อสมาชิก |

---

## 4.Class: Librarian

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| name | String | private | ชื่อบรรณารักษ์ |
| librarianCount | int | public static | นับจำนวนบรรณารักษ์ |

### Method
| Method | คำอธิบาย |
|---|---|
| Librarian() | constructor เริ่มต้น |
| Librarian(String name) | constructor กำหนดชื่อ |
| createTransaction(Member, BookCopy, Date, Date) | สร้างรายการยืม |
| getName() | คืนค่าชื่อบรรณารักษ์ |

---

## 5.Class: BorrowTransaction

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| member | Member | private | สมาชิกที่ยืม |
| copy | BookCopy | private | สำเนาหนังสือ |
| fine | Fine | private | ค่าปรับ |
| borrowDate | Date | private | วันที่ยืม |
| dueDate | Date | private | วันที่กำหนดคืน |
| returnDate | Date | private | วันที่คืน |
| transactionCount | int | public static | นับจำนวนรายการ |

### Method
| Method | คำอธิบาย |
|---|---|
| BorrowTransaction() | constructor เริ่มต้น |
| BorrowTransaction(Member, BookCopy, Date, Date) | constructor สร้างรายการยืม |
| returnBook(Date) | คืนหนังสือและคำนวณค่าปรับ |
| getBorrowDate() | คืนวันที่ยืม |
| getDueDate() | คืนวันที่กำหนดคืน |
| getFine() | คืนค่าปรับ |

---

## 6.Class: Fine

### Attribute
| ชื่อ | ชนิดข้อมูล | Access Modifier | คำอธิบาย |
|---|---|---|---|
| amount | double | private | จำนวนเงินค่าปรับ |

### Method
| Method | คำอธิบาย |
|---|---|
| Fine() | constructor เริ่มต้น |
| Fine(double amount) | constructor กำหนดค่าปรับ |
| getAmount() | คืนค่าปรับ |

---

## 7.Enum: CopyStatus
| ค่า | คำอธิบาย |
|---|---|
| AVAILABLE | สามารถยืมได้ |
| BORROWED | ถูกยืมอยู่ |

---

## ผู้จัดทำ
ชื่อ: ____________________  
รหัสนักศึกษา: ____________  
ทำไรในกลุ่ม: __________________
