public class Fine {
    private double amount;

    public Fine(double amount) {
        try {
            if (amount < 0) {
                throw new IllegalArgumentException("ค่าปรับต้องไม่ติดลบ");
            }
            this.amount = amount;
        } catch (Exception e) {
            System.out.println("สร้างค่าปรับไม่สำเร็จ: " + e.getMessage());
        }
    }

    public double getAmount() {
        return amount;
    }
}