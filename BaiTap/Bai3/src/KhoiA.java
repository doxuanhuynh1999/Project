public class KhoiA extends ThiSinh{
    public static final String TOAN = "Toan";
    public static final String LY = "Ly";
    public static final String HOA = "Hoa";

    public KhoiA(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiA() {
    }

    @Override
    public String toString() {
        return "KhoiA{} " + super.toString()+ " ( " +  TOAN + " - " + LY + " - "+ HOA +" )";
    }
}
