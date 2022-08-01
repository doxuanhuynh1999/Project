public class NhanVien extends CanBo{
    private String congViec;
    public NhanVien(String ho, String ten, int tuoi, String gioiTinh, String diaChi, String congViec) {
        super(ho, ten, tuoi, gioiTinh, diaChi);
        this.congViec = congViec;
    }
    public NhanVien() {
    }

    public String getCongViec() {
        return congViec;
    }

    public void setCongViec(String congViec) {
        this.congViec = congViec;
    }

    @Override
    public void display() {
        System.out.print(getHo() + " " + getTen() + " - ");
        System.out.print(getTuoi() + " - ");
        System.out.print(getGioiTinh() + " - ");
        System.out.print(getCongViec());
        System.out.println();
    }
}
