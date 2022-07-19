import java.util.ArrayList;
import java.util.Scanner;

public class CanBo {
    static ArrayList<Nguoi> listCanBo = new ArrayList<>();
    static Scanner sc= new Scanner(System.in);
    public static void themCanBo(){
        System.out.print("tên: ");
        String ten = sc.next();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Quê quán: ");
        String queQuan = sc.next();
        System.out.print("Mã giá viên: ");
        String maGV = sc.next();
        System.out.print("Lương cứng: ");
        int luongCung = sc.nextInt();
        System.out.print("Lương thưởng: ");
        int luongThuong = sc.nextInt();
        System.out.print("Lương phạt: ");
        int luongPhat = sc.nextInt();
        Nguoi nguoi = new Nguoi(ten,tuoi,queQuan,maGV,luongCung,luongThuong,luongPhat);
        listCanBo.add(nguoi);
        System.out.println("Done!");
    }
    public static void xoaCanBo(){
        System.out.print("Mã cán bộ bạn muốn xóa: ");
        String maCB = sc.next();
        Nguoi cBCanXoa = listCanBo.stream().filter(cb -> cb.getMaGV().equalsIgnoreCase(maCB)).findFirst().orElse(null);
        if(cBCanXoa == null){
            System.out.println("không tìm thấy");
            return;
        }
        listCanBo.remove(cBCanXoa);
    }
    public static void luong(){
        System.out.print("Mã cán bộ bạn muốn tính lương: ");
        String maCB = sc.next();
        Nguoi cBCanTinh = listCanBo.stream().filter(cb -> cb.getMaGV().equalsIgnoreCase(maCB)).findFirst().orElse(null);
        if(cBCanTinh == null){
            System.out.println("không tìm thấy");
            return;
        }
        System.out.println( "Lương: "+cBCanTinh.luong());
    }
    public static void hienThi(){
        listCanBo.forEach(cb -> System.out.println(cb));
    }
}
