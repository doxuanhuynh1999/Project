import java.util.ArrayList;

public class GiaDinh {
    private ArrayList<Nguoi> nguois;
    private String diaChi;

    public GiaDinh(ArrayList<Nguoi> nguois, String diaChi) {
        this.nguois = nguois;
        this.diaChi = diaChi;
    }
    public GiaDinh(){};

    public ArrayList<Nguoi> getNguois() {
        return nguois;
    }

    public void setNguois(ArrayList<Nguoi> nguois) {
        this.nguois = nguois;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "Gia đình " + this.nguois + " - " + this.diaChi + '\'';
    }
}
