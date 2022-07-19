public class Bao extends QuanLySach{
    private String ngayPhatHanh;

    public Bao(int id, String tenNhaXuatBan, int soBan, String ngayPhatHanh) {
        super(id, tenNhaXuatBan, soBan);
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public Bao() {
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    @Override
    public String toString() {
        return "Báo: "+ super.toString() + " - " + this.ngayPhatHanh;
    }
}

