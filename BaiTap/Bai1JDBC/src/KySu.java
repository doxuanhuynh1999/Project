public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu(String ho, String ten, int tuoi, String gioiTinh, String diaChi, String nganhDaoTao) {
        super(ho, ten, tuoi, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }
    public KySu() {
    }

    public String getNganhDaoTao() {
        return nganhDaoTao;
    }

    public void setNganhDaoTao(String nganhDaoTao) {
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public void display() {
        System.out.print(getHo() + " " + getTen() + " - ");
        System.out.print(getTuoi() + " - ");
        System.out.print(getGioiTinh() + " - ");
        System.out.print(getNganhDaoTao());
        System.out.println();
    }
}
