public class Phong {
    private String loaiPhong;
    private int gia;

    public Phong(String loaiPhong, int gia) {
        this.loaiPhong = loaiPhong;
        this.gia = gia;
    }
    public Phong(){};

    public String getLoaiPhong() {
        return loaiPhong;
    }

    public void setLoaiPhong(String loaiPhong) {
        this.loaiPhong = loaiPhong;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int soNgay) {
        this.gia = gia;
    }

    @Override
    public String toString() {
        return "loaiPhong='" + loaiPhong  + ", soNgay=" + gia ;
    }
}
