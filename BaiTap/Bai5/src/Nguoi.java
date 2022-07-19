public class Nguoi {
    private String ten;
    private int tuoi;
    private String soCMT;
    private Phong phong;
    private int soNgayThue;

    public Nguoi(String ten, int tuoi, String soCMT, Phong phong, int soNgayThue) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.soCMT = soCMT;
        this.phong = phong;
        this.soNgayThue = soNgayThue;
    }

    public Nguoi() {
    }

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

    public String getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(String soCMT) {
        this.soCMT = soCMT;
    }

    public Phong getPhong() {
        return phong;
    }

    public void setPhong(Phong phong) {
        this.phong = phong;
    }

    public int getSoNgayThue() {
        return soNgayThue;
    }

    public void setSoNgayThue(int soNgayThue) {
        this.soNgayThue = soNgayThue;
    }

    @Override
    public String toString() {
        return
                "ten='" + ten  +
                ", tuoi=" + tuoi +
                ", soCMT='" + soCMT  +
                ", phong=" + phong +
                ", soNgayThue=" + soNgayThue
                ;
    }
}
