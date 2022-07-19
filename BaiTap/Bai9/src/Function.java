import java.util.ArrayList;
import java.util.Scanner;

public class Function {
    static ArrayList<BienLai> listBienLai = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void them(){
        System.out.print("Tên chủ hộ: ");
        String ten = sc.next();
        System.out.print("Số nhà: ");
        String soNha = sc.next();
        System.out.print("Mã số công tơ: ");
        String maSo = sc.next();
        System.out.print("Số điện cũ: ");
        int soCu = sc.nextInt();
        System.out.print("Số điện mới: ");
        int soMoi = sc.nextInt();
        ChuHo chuHo = new ChuHo(ten,soNha,maSo);
        BienLai bienLai = new BienLai(chuHo,soCu,soMoi);
        listBienLai.add(bienLai);
        System.out.println("Done!");
    }
    public static void xoa(){
        System.out.print("Mã công tơ bạn muốn xóa: ");
        String maCongTo =  sc.next();
        BienLai bienLaiXoa = listBienLai.stream().filter(bl -> bl.getChuHo().getMaCongTo().equalsIgnoreCase(maCongTo))
                .findFirst()
                .orElse(null);
        if (bienLaiXoa == null){
            System.out.println("không tìm thấy");
            return;
        }
        listBienLai.remove(bienLaiXoa);
        System.out.println("Done!");
    }
    public static void tinhTienDien(){
        System.out.print("Mã công tơ bạn muốn tính tiền: ");
        String maCongTo =  sc.next();
        BienLai bienLaiTinhTiien = listBienLai.stream().filter(bl -> bl.getChuHo().getMaCongTo().equalsIgnoreCase(maCongTo))
                .findFirst()
                .orElse(null);
        if (bienLaiTinhTiien == null){
            System.out.println("không tìm thấy");
            return;
        }
        int tien =(bienLaiTinhTiien.getSoMoi() -bienLaiTinhTiien.getSoCu())*5;
        System.out.println("Tiền điện của bạn là: " + tien);
    }
    public static void hienThi(){
        listBienLai.forEach(bl -> System.out.println(bl));
    }
}
