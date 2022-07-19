public class Sach extends QuanLySach{
    private String tenTacGia;
    private int soTrang;

    public Sach(int id, String tenNhaXuatBan, int soBan, String tenTacGia, int soTrang) {
        super(id, tenNhaXuatBan, soBan);
        this.tenTacGia = tenTacGia;
        this.soTrang = soTrang;
    }

    public Sach() {
    }


    public String getTenTacGia() {
        return tenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public int getSoTrang(){
        return soTrang;
    }

    public void setSoTrang(int soTrang) {
        this.soTrang = soTrang;
    }

    @Override
    public String toString() {
        return "sách: " + super.toString() + " - " + this.tenTacGia + " - " + this.soTrang;
    }
}
