public class ChuHo {
    private String ten;
    private String soNha;
    private String maCongTo;

    public ChuHo(String ten, String soNha, String maCongTo) {
        this.ten = ten;
        this.soNha = soNha;
        this.maCongTo = maCongTo;
    }
    public ChuHo(){};

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getSoNha() {
        return soNha;
    }

    public void setSoNha(String soNha) {
        this.soNha = soNha;
    }

    public String getMaCongTo() {
        return maCongTo;
    }

    public void setMaCongTo(String maCongTo) {
        this.maCongTo = maCongTo;
    }

    public String toString() {
        return "ChuHo{" +
                "ten='" + ten + '\'' +
                ", soNha='" + soNha + '\'' +
                ", maCongTo='" + maCongTo + '\'' +
                '}';
    }
}
