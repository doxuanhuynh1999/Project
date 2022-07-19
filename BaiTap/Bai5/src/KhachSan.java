import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
    static ArrayList<Nguoi> nguois = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static Phong themPhong(){
        System.out.println("Bạn muốn thêm loại phòng nào: ");
        System.out.println("1: Loại A \n 2: Loại B \n 3: Loại C");
        System.out.println("Bạn chọn loại nào: ");
        int chon = sc.nextInt();
        if(chon == 1){
            Phong phongA = new Phong("A",500);
            return phongA;
        }else if (chon == 2){
            Phong phongB = new Phong("B",300);
            return phongB;
        }else {
            Phong phongC = new Phong("C",100);
            return phongC;
        }
    }
    public static void themNguoi(){
        System.out.print("Tên: ");
        String ten = sc.next();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Số CMT: ");
        String soCMT = sc.next();
        Phong phong = themPhong();
        System.out.print("Số ngày thuê: ");
        int soNgayThue = sc.nextInt();
        Nguoi nguoi = new Nguoi(ten,tuoi,soCMT,phong,soNgayThue);
        nguois.add(nguoi);
    }
    public static void xoaTheoCMT(){
        System.out.print("Số CMT bạn muốn xóa: ");
        String soCMTXoa = sc.next();
        Nguoi nguoiMuonXoa = nguois.stream().filter(p -> p.getSoCMT().equalsIgnoreCase(soCMTXoa)).findFirst().orElse(null);
        if (nguoiMuonXoa == null){
            System.out.println("Không tìm thấy");
            return;
        }
        nguois.remove(nguoiMuonXoa);
    }
    public static void tinhTienPhong(){
        System.out.print("Số CMT bạn muốn tính tiền: ");
        String soCMTTinhTien = sc.next();
        Nguoi nguoiMuonTinhTien = nguois.stream().filter(p -> p.getSoCMT().equalsIgnoreCase(soCMTTinhTien)).findFirst().orElse(null);
        if (nguoiMuonTinhTien == null){
            System.out.println("Không tìm thấy");
            return;
        }
        System.out.println("Số tiền là: "+nguoiMuonTinhTien.getPhong().getGia() * nguoiMuonTinhTien.getSoNgayThue());
    }
    public static void hienThi(){
        nguois.forEach(p -> System.out.println(p));
    }

}
