public class KhoiC extends ThiSinh{
    public static final String VAN = "Van";
    public static final String SU = "Su";
    public static final String DIA = "Dia";

    public KhoiC(String soBaoDanh, String hoTen, String diaChi, int mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    public KhoiC() {
    }

    @Override
    public String toString() {
        return "KhoiC{} " + super.toString() + " ( " +  VAN + " - " + SU + " - "+ DIA +" )";
    }
}
