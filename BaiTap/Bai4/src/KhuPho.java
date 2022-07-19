import java.util.ArrayList;
import java.util.Scanner;

public class KhuPho {
    private ArrayList<GiaDinh> giaDinhs;

    public KhuPho(ArrayList<GiaDinh> giaDinhs) {
        this.giaDinhs = giaDinhs;
    }

    public ArrayList<GiaDinh> getGiaDinhs() {
        return giaDinhs;
    }

    public void setGiaDinhs(ArrayList<GiaDinh> giaDinhs) {
        this.giaDinhs = giaDinhs;
    }

    @Override
    public String toString() {
        return "Khu phố" + giaDinhs + '\'';
    }
}
