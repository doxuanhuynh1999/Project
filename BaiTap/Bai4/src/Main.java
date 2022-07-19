import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số hộ dân trong khu phố là: ");
        ArrayList<GiaDinh> giaDinhArrayList = new ArrayList<>();
        int soHoDan = sc.nextInt();
        for (int i = 0; i < soHoDan; i++){
            System.out.print("Số người bạn muốn thêm vào hộ " + (i+1) + ": ");
            int soNguoi = sc.nextInt();
            ArrayList<Nguoi> soNguoiTrongGiaDinh = new ArrayList<>();
            for (int j = 0; j < soNguoi; j++){
                System.out.print("Tên người thứ "+ (j+1) + ": ");
                String ten = sc.next();
                System.out.print("Tuổi người thứ " + (j+1) + ": ");
                int tuoi = sc.nextInt();
                System.out.print("Nghề nghiệp người thứ " + (j+1) +": ");
                String ngheNghiep = sc.next();
                System.out.print("Số CMT người thứ " + (j+1)+ ": ");
                int soCMT = sc.nextInt();
                soNguoiTrongGiaDinh.add(new Nguoi(ten,tuoi,ngheNghiep,soCMT));
            }
            System.out.print("Nhập địa chỉ gia đình thứ " + (i+1) + ": ");
            String diaChi = sc.next();
            GiaDinh giaDinh = new GiaDinh(soNguoiTrongGiaDinh,diaChi);
            giaDinhArrayList.add(giaDinh);
        }
        KhuPho khuPho = new KhuPho(giaDinhArrayList);
        System.out.println(khuPho);
    }
}
