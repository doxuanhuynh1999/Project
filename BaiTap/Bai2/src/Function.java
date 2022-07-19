import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Function {
    static ArrayList<QuanLySach> quanLySach = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // them sach
    public static void themSach(){
        System.out.print("Mã tài liệu: ");
        int id = sc.nextInt();
        System.out.print("Tên nhà xuất bản: ");
        String teNhaXuatBan = sc.next();
        System.out.print("Số bản phát hành: ");
        int soBan = sc.nextInt();
        System.out.print("Tên tác giả: ");
        String tenTacGia = sc.next();
        System.out.print("Số trang: ");
        int soTrang = sc.nextInt();
        Sach sach = new Sach(id,teNhaXuatBan,soBan,tenTacGia,soTrang);
        quanLySach.add(sach);
        System.out.println("Done!");
    }
    // them tap chi
    public static void themTapChi(){
        System.out.print("Mã tài liệu: ");
        int id = sc.nextInt();
        System.out.print("Tên nhà xuất bản: ");
        String teNhaXuatBan = sc.next();
        System.out.print("Số bản phát hành: ");
        int soBan = sc.nextInt();
        System.out.print("Số phát hành: ");
        int soPHatHanh = sc.nextInt();
        System.out.print("Tháng phát hành: ");
        int thangPhatHanh = sc.nextInt();
        TapChi tapChi = new TapChi(id,teNhaXuatBan,soBan,soPHatHanh,thangPhatHanh);
        quanLySach.add(tapChi);
        System.out.println("Done!");
    }
    // them bao
    public static void themBao(){
        System.out.print("Mã tài liệu: ");
        int id = sc.nextInt();
        System.out.print("Tên nhà xuất bản: ");
        String teNhaXuatBan = sc.next();
        System.out.print("Số bản phát hành: ");
        int soBan = sc.nextInt();
        System.out.print("Ngày phát hành: ");
        String ngayPhatHanh = sc.next();
        Bao bao = new Bao(id,teNhaXuatBan,soBan,ngayPhatHanh);
        quanLySach.add(bao);
        System.out.println("Done!");
    }
    //  them sach bao tap chi
    public static void themMoi(){
        System.out.println("Bạn muốn thêm: ");
        System.out.println("1: Thêm sách \n 2: Thêm tap chí \n 3: Thêm báo");
        System.out.println("Lựa chọn của bạn là: ");
        int luachon = sc.nextInt();
        if(luachon == 1){
            themSach();
        }else if(luachon == 2){
            themTapChi();
        }else if (luachon == 3){
            themBao();
        }
    }
    // Xoa tai lieu theo id
    public static void xoaTaiLieu(){
        System.out.print("ID bạn muốn xóa là: ");
        int id = sc.nextInt();
        QuanLySach taiLieu = quanLySach.stream().filter(taiLieuCanXoa -> taiLieuCanXoa.getId() == id).findFirst().orElse(null);
        if (taiLieu == null){
            System.out.println("Không tìm thấy!!");
            return;
        }
        quanLySach.remove(taiLieu);
    }
    // Hiển thị tài liệu
    public static void hienThi(){
        quanLySach.forEach(doc -> System.out.println(doc));
    }
    // Tìm kiếm Sách
    public static void timSach(){
        quanLySach.stream().filter(sach -> sach instanceof Sach).forEachOrdered(sach -> System.out.println(sach));
    }
    // Tìm kiếm theo tạp chí
    public static void timTapChi(){
        quanLySach.stream().filter(tapChi -> tapChi instanceof TapChi).forEach(tapChi -> System.out.println(tapChi));
    }
    // Tìm kiếm theo báo
    public static void timKiemBao(){
        quanLySach.stream().filter(bao ->  bao instanceof  Bao).forEach(bao -> System.out.println(bao));
    }
    // tim kiem
    public static void timKiem(){
        System.out.println(":Bạn muốn tìm kiếm theo loại nào: ");
        System.out.println("1: sách \n 2: tap chí \n 3:  báo");
        System.out.println("Lựa chọn của bạn là: ");
        int luachon = sc.nextInt();
        if(luachon == 1){
            timSach();
        }else if(luachon == 2){
            timTapChi();
        }else if (luachon == 3){
            timKiemBao();
        }
    }
}
