public class Nguoi {
    private String ten;
    private int tuoi;
    private String queQuan;
    private String maGV;
    private int luongCung;
    private int luongThuong;
    private int luongPhat;

    public Nguoi(String ten, int tuoi, String queQuan, String maGV, int luongCung, int luongThuong, int luongPhat) {
        this.ten = ten;
        this.tuoi = tuoi;
        this.queQuan = queQuan;
        this.maGV = maGV;
        this.luongCung = luongCung;
        this.luongThuong = luongThuong;
        this.luongPhat = luongPhat;
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

    public String getQueQuan() {
        return queQuan;
    }

    public void setQueQuan(String queQuan) {
        this.queQuan = queQuan;
    }

    public String getMaGV() {
        return maGV;
    }

    public void setMaGV(String maGV) {
        this.maGV = maGV;
    }

    public int getLuongCung() {
        return luongCung;
    }


    public void setLuongCung(int luongCung) {
        this.luongCung = luongCung;
    }

    public int getLuongThuong() {
        return luongThuong;
    }

    public void setLuongThuong(int luongThuong) {
        this.luongThuong = luongThuong;
    }

    public int getLuongPhat() {
        return luongPhat;
    }

    public void setLuongPhat(int luongPhat) {
        this.luongPhat = luongPhat;
    }
    public int luong(){
        return luongCung + luongThuong - luongPhat;
    }

    @Override
    public String toString() {
        return "Nguoi{" +
                "ten='" + ten + '\'' +
                ", tuoi=" + tuoi +
                ", queQuan='" + queQuan + '\'' +
                ", maGV='" + maGV + '\'' +
                ", luongCung=" + luongCung +
                ", luongThuong=" + luongThuong +
                ", luongPhat=" + luongPhat +
                '}';
    }
}
