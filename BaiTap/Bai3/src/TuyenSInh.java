import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSInh {
    static ArrayList<ThiSinh> thiSinh = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    // Them vao khoi A
    public static void themKhoiA(){
        System.out.print("Số báo danh: ");
        String soBaoDanh = sc.next();
        System.out.print("Họ tên: ");
        String hoTen = sc.next();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.next();
        System.out.print("Mức ưu tiên: ");
        int mucUuTien = sc.nextInt();
        KhoiA khoiA = new KhoiA(soBaoDanh,hoTen,diaChi,mucUuTien);
        thiSinh.add(khoiA);
    }
    // Them vao khoi B
    public static void themKhoiB(){
        System.out.print("Số báo danh: ");
        String soBaoDanh = sc.next();
        System.out.print("Họ tên: ");
        String hoTen = sc.next();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.next();
        System.out.print("Mức ưu tiên: ");
        int mucUuTien = sc.nextInt();
        KhoiB khoiB = new KhoiB(soBaoDanh,hoTen,diaChi,mucUuTien);
        thiSinh.add(khoiB);
    }
    // Them vao khoi A
    public static void themKhoiC(){
        System.out.print("Số báo danh: ");
        String soBaoDanh = sc.next();
        System.out.print("Họ tên: ");
        String hoTen = sc.next();
        System.out.print("Địa chỉ: ");
        String diaChi = sc.next();
        System.out.print("Mức ưu tiên: ");
        int mucUuTien = sc.nextInt();
        KhoiC khoiC = new KhoiC(soBaoDanh,hoTen,diaChi,mucUuTien);
        thiSinh.add(khoiC);
    }
    // Thêm thí sinh mơi
    public static void themThiSinh(){
        System.out.println("Bạn muốn thêm thí sinh: ");
        System.out.println("1: Khối A \n " +
                "2: Khối B \n" +
                "3: Khối C \n" );
        System.out.println("Lựa chọn của bạn là: ");
        int luaChon = sc.nextInt();
        if (luaChon == 1){
            themKhoiA();
            System.out.println("Done!");
        }else if (luaChon == 2){
            themKhoiB();
            System.out.println("Done!");
        }else if (luaChon == 3){
            themKhoiC();
            System.out.println("Done!");
        }
    }
    // Hiện thị thông tin thí sinh
    public static void hienThi(){
        thiSinh.forEach(p -> System.out.println(p));
    }
    // Tìm kiếm theo số báo danh
    public static void timKiem(){
        System.out.println("Số báo danh bạn muốn tìm kiếm: ");
        String soBaoDanh = sc.next();
        ThiSinh thiSinhTimKiem = thiSinh.stream().filter(c -> c.getSoBaoDanh().equalsIgnoreCase(soBaoDanh)).findFirst().orElse(null);
        if (thiSinhTimKiem == null){
            System.out.println("Không tìm thấy");
            return;
        }
    }



}
