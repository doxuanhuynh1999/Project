import java.util.ArrayList;
import java.util.Scanner;

public class Truong {
    static ArrayList<HocSinh> hocSinhArrayList = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);
    public static void themHocSinh(){
        System.out.print("tên: ");
        String ten = sc.next();
        System.out.print("Tuổi: ");
        int tuoi = sc.nextInt();
        System.out.print("Quê quán: ");
        String queQuan = sc.next();
        System.out.print("Lớp: ");
        String lop = sc.next();
        HocSinh hocSinh = new HocSinh(ten,tuoi,queQuan,lop);
        hocSinhArrayList.add(hocSinh);
        System.out.println("Done!");
    }
    public static void hienThi(){
        hocSinhArrayList.stream().forEach(hs -> System.out.println(hs));
    }
    public static void hienThiHs20(){
        hocSinhArrayList.stream().filter(hs -> hs.getTuoi() == 20).forEach(hs -> System.out.println(hs));
    }
    public static void soLuong(){
        int countHs =(int) hocSinhArrayList.stream().filter(hs -> hs.getTuoi() == 23 && hs.getQueQUan().equalsIgnoreCase("DN")).count();
        System.out.println("Số học sinh là: "+countHs);
    }
}
