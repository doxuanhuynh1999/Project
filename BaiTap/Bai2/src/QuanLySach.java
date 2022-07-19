public class QuanLySach {
    private int id;
    private String tenNhaXuatBan;
    private int soBan;
    public QuanLySach(int id, String tenNhaXuatBan, int soBan){
        this.id = id;
        this.tenNhaXuatBan = tenNhaXuatBan;
        this.soBan= soBan;
    }
    public QuanLySach(){};

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTenNhaXuatBan() {
        return tenNhaXuatBan;
    }

    public void setTenNhaXuatBan(String tenNhaXuatBan) {
        this.tenNhaXuatBan = tenNhaXuatBan;
    }

    public int getSoBan() {
        return soBan;
    }

    public void setSoBan(int soBan) {
        this.soBan = soBan;
    }

    @Override
    public String toString() {
        return this.id + " - " + this.tenNhaXuatBan + " - " + this.soBan;
    }
}
