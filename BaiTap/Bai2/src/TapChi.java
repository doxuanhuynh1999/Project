public class TapChi extends QuanLySach{
    private int soPhatHanh;
    private int thangPhatHanh;

    public TapChi(int id, String tenNhaXuatBan, int soBan, int soPhatHanh, int thangPhatHanh) {
        super(id, tenNhaXuatBan, soBan);
        this.soPhatHanh = soPhatHanh;
        this.thangPhatHanh = thangPhatHanh;
    }

    public TapChi() {
    }

    public int getSoPhatHanh() {
        return soPhatHanh;
    }

    public void setSoPhatHanh(int soPhatHanh) {
        this.soPhatHanh = soPhatHanh;
    }

    public int getThangPhatHanh() {
        return thangPhatHanh;
    }

    public void setThangPhatHanh(int thangPhatHanh) {
        this.thangPhatHanh = thangPhatHanh;
    }

    @Override
    public String toString() {
        return "Tạp chí: " + super.toString() + " - " + this.soPhatHanh + " - " + this.thangPhatHanh;

    }
}
