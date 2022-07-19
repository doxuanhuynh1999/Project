public class KhoiB extends ThiSinh{
    public static final String TOAN = "Toan";
    public static final String SINH = "Sinh";
    public static final String HOA = "Hoa";

    public KhoiB(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiB() {
    }

    @Override
    public String toString() {
        return "KhoiB{} " + super.toString() + " ( " +  TOAN + " - " + SINH + " - "+ HOA +" )";
    }
}
