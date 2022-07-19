import java.util.ArrayList;
import java.util.Scanner;

public class TheMuon {
    static ArrayList<The> listThe = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void them(){
        System.out.print("Tên: ");
        String ten = sc.next();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Lớp: ");
        String lop = sc.next();
        System.out.print("Mã phiếu mượn: ");
        String maphieuMuon = sc.next();
        System.out.print("Ngày mượn: ");
        int ngayMuon = sc.nextInt();
        System.out.print("Ngày trả: ");
        int ngayTra = sc.nextInt();
        System.out.print("Số hiệu sách: ");
        String soHieu = sc.next();
        SinhVien sv = new SinhVien(ten,tuoi,lop);
        listThe.add(new The(maphieuMuon,ngayMuon,ngayTra,soHieu,sv));
        System.out.println("Done!");
    }
    public static void xoaTheoMa(){
        System.out.println("mã phiếu mượn bạn muốn xóa: ");
        String maPhieuXoa = sc.next();
        The theXoa = listThe.stream().filter(t -> t.getMaThe().equalsIgnoreCase(maPhieuXoa)).findFirst().orElse(null);
        if (theXoa == null){
            System.out.println("không tìm thấy");
            return;
        }
        listThe.remove(theXoa);
        System.out.println("Done!");
    }
    public static void hienThi(){
        listThe.stream().forEach(t -> System.out.println(t));
    }
}
