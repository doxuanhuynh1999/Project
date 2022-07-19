public class HocSinh {
    private String ten;
    private int tuoi;
    private String queQUan;
    private String lop;

    public HocSinh(String ten, int tuoi, String queQUan, String lop) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQUan = queQUan;
        this.lop = lop;
    }
    public HocSinh(){};

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getQueQUan() {
        return queQUan;
    }

    public void setQueQUan(String queQUan) {
        this.queQUan = queQUan;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    @Override
    public String toString() {
        return "HocSinh{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", queQUan='" + queQUan + '\'' +
                ", lop='" + lop + '\'' +
                '}';
    }
}
