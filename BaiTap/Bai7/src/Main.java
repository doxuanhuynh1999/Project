import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int luaChon;
        String tiepTuc;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("---Menu--");
            System.out.print("1: Thêm cán bộ\n" +
                    "2:Xóa cán bộ \n" +
                    "3: Hiện thị \n"
                    + "4: Tính lương\n"
            );
            System.out.print("Nhập giá trị bạn muốn xem: ");
            luaChon = sc.nextInt();
            if (luaChon > 4 || luaChon < 0) {
                System.out.print("Nhập lại giá trị bạn muốn xem: ");
                luaChon = sc.nextInt();
            }
            switch (luaChon) {
                case 1:
                    CanBo.themCanBo();
                    break;
                case 2:
                    CanBo.xoaCanBo();
                    break;
                case 3:
                    CanBo.hienThi();
                    break;
                case 4:
                    CanBo.luong();
                    break;
            }
            System.out.print("Bạn có muốn tiếp tục không nếu muốn hãy ấn yes,y, nếu không hay ấn no: ");
            tiepTuc = sc.next();
        } while (tiepTuc.equalsIgnoreCase("y") || tiepTuc.equalsIgnoreCase("yes"));
    }
}
