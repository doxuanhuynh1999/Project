import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm người\n" +
                    "2: Xóa theo số cmt \n" +
                    "3: Tính  tiền theo số CMT \n"
                    + "4: Hiện thị \n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon =sc.nextInt();
            if(luaChon > 4 || luaChon < 0){
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon){
                case 1:
                    KhachSan.themNguoi();
                    break;
                case 2:
                    KhachSan.xoaTheoCMT();
                    break;
                case 3:
                    KhachSan.tinhTienPhong();
                    break;
                case 4:
                    KhachSan.hienThi();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        }while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}
