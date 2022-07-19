public class BienLai {
    private ChuHo chuHo;
    private int soCu;
    private int soMoi;

    public BienLai(ChuHo chuHo, int soCu, int soMoi) {
        this.chuHo = chuHo;
        this.soCu = soCu;
        this.soMoi = soMoi;
    }
    public BienLai(){};

    public ChuHo getChuHo() {
        return chuHo;
    }

    public void setChuHo(ChuHo chuHo) {
        this.chuHo = chuHo;
    }

    public int getSoCu() {
        return soCu;
    }

    public void setSoCu(int soCu) {
        this.soCu = soCu;
    }

    public int getSoMoi() {
        return soMoi;
    }

    public void setSoMoi(int soMoi) {
        this.soMoi = soMoi;
    }

    @Override
    public String toString() {
        return "BienLai{" +
                "chuHo=" + chuHo +
                ", soCu=" + soCu +
                ", soMoi=" + soMoi +
                '}';
    }
}