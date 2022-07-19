public class Nguoi {
    private String ten;
    private int tuoi;
    private String ngheNghiep;
    private int soCMT;

    public Nguoi(String ten, int tuoi, String ngheNghiep, int soCMT) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.ngheNghiep = ngheNghiep;
        this.soCMT = soCMT;
    }
    public Nguoi(){};

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

    public String getNgheNghiep() {
        return ngheNghiep;
    }

    public void setNgheNghiep(String ngheNghiep) {
        this.ngheNghiep = ngheNghiep;
    }

    public int getSoCMT() {
        return soCMT;
    }

    public void setSoCMT(int soCMT) {
        this.soCMT = soCMT;
    }

    @Override
    public String toString() {
        return this.ten + " - " + this.tuoi + " - " + this.ngheNghiep + " - " + this.soCMT;
    }
}
