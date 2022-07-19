import javax.xml.crypto.Data;

public class The {
    private String maThe;
    private int ngayMuon;
    private int ngayTra;
    private String soHieuSach;
    private SinhVien sinhVien;

    public The(String maThe, int ngayMuon, int ngayTra, String soHieuSach, SinhVien sinhVien) {
        this.maThe = maThe;
        this.ngayMuon = ngayMuon;
        this.ngayTra = ngayTra;
        this.soHieuSach = soHieuSach;
        this.sinhVien = sinhVien;
    }

    public The() {
    }

    public String getMaThe() {
        return maThe;
    }

    public void setMaThe(String maThe) {
        this.maThe = maThe;
    }

    public int getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(int ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public int getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(int ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public SinhVien getSinhVien() {
        return sinhVien;
    }

    public void setSinhVien(SinhVien sinhVien) {
        this.sinhVien = sinhVien;
    }

    @Override
    public String toString() {
        return "The{" +
                "maThe='" + maThe + '\'' +
                ", ngayMuon=" + ngayMuon +
                ", ngayTra=" + ngayTra +
                ", soHieuSach='" + soHieuSach + '\'' +
                ", sinhVien=" + sinhVien +
                '}';
    }
}
