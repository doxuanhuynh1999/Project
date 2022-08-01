public class CongNhan extends CanBo{
    private int bac;

    public CongNhan(String ho, String ten, int tuoi, String gioiTinh, String diaChi, int bac) {
        super(ho, ten, tuoi, gioiTinh, diaChi);
        this.bac = bac;
    }

    public CongNhan() {
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public void display() {
        System.out.print(getHo() + " " + getTen() + " - ");
        System.out.print(getTuoi() + " - ");
        System.out.print(getGioiTinh() + " - ");
        System.out.print(getBac());
        System.out.println();
    }
}
